/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.DaoPersistenceException;
import com.sg.flooringmastery.dao.OrderDao;
import com.sg.flooringmastery.dao.ProductDao;
import com.sg.flooringmastery.dao.TaxDao;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Product;
import com.sg.flooringmastery.dto.Tax;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class ServiceImpl implements Service {

    private TaxDao taxDao;
    private ProductDao productDao;
    private OrderDao orderDao;

    public ServiceImpl(TaxDao taxDao, ProductDao productDao, OrderDao orderDao) {
        this.taxDao = taxDao;
        this.productDao = productDao;
        this.orderDao = orderDao;
    }

    @Override
    public List<Order> displayOrders(LocalDate date) throws DaoPersistenceException {
        return orderDao.readAllOrders(date);
    }

    @Override
    public void addOrder(Order order) throws DaoPersistenceException, OrderValidationException, OrderInvalidException {
        int orderNumber,
                lastOrderNumber;
        List<Order> existingOrders = orderDao.getExistingOrders(LocalDate.now());
        //TODO
        //check if there is an existing order number if not make ordernumber 1 if there is increment order number by existing one plus one
//        if (existingOrders == null) {
        if (existingOrders == null) {
            orderNumber = 1;
        } else {
            lastOrderNumber = existingOrders.get(existingOrders.size() - 1).getOrderNumber();
            orderNumber = lastOrderNumber + 1;
        }
        //set the order number
        order.setOrderNumber(orderNumber);
        validateOrderInfo(order);
//        ********* ISSUE HERE FIX ********
        order = finishOrderInfo(order);
        //create order
        orderDao.createOrder(LocalDate.now(), order);
    }

    @Override
    public void editOrder(LocalDate date, int orderNumber, Order newOrder) throws DaoPersistenceException, OrderNotFoundException, OrderValidationException, OrderInvalidException {
        Order originalOrder = getOrder(date, orderNumber);

        //CustomerName,State,ProductType,Area
        if (newOrder.getCustomerName() == null) {
            newOrder.setCustomerName(originalOrder.getCustomerName());
        }

        if (newOrder.getState() == null) {
            newOrder.setState(originalOrder.getState());
        }

        if (newOrder.getProductType() == null) {
            newOrder.setProductType(originalOrder.getProductType());
        }

        if (newOrder.getArea() == null) {
            newOrder.setArea(originalOrder.getArea());
        }

        validateOrderInfo(newOrder);
//        ********* ISSUE HERE FIX ********
        finishOrderInfo(newOrder);
        orderDao.updateOrder(date, orderNumber, newOrder);
    }

    @Override
    public void removeOrder(LocalDate date, int orderNumber) throws DaoPersistenceException {
        orderDao.deleteOrder(date, orderNumber);
    }

    @Override
    public void save() throws DaoPersistenceException{
        orderDao.saveOrder();
    }

    @Override
    public Order getOrder(LocalDate date, int orderNumber) throws DaoPersistenceException, OrderNotFoundException {
        Order order = orderDao.readOrderById(date, orderNumber);

        if (order == null) {
            throw new OrderNotFoundException("Sorry no order was found with that ID.");
        }
        return order;
    }

    private void validateOrderInfo(Order order) throws OrderValidationException {
        if (order.getCustomerName().trim().length() == 0
                || order.getCustomerName() == null
                || order.getState().trim().length() == 0
                || order.getState() == null
                || order.getProductType().trim().length() == 0
                || order.getProductType() == null
                || order.getArea().equals(new BigDecimal("0.00"))
                || order.getArea() == null) {
            throw new OrderValidationException("*** Please fill all the information for the required fields ***"
                    + "'Name, State, Product Type, and Area'");
        }
//        //TEST
//        System.out.println(order.getCustomerName());
//        System.out.println(order.getState());
//        System.out.println(order.getProductType());
//        System.out.println(order.getArea());
    }

    //FIX PROMPTLY
    private Order finishOrderInfo(Order order) throws DaoPersistenceException, OrderInvalidException {
        List<Tax> taxList = taxDao.readAllTaxes();
        List<Product> productList = productDao.readAllProducts();

        for (Tax currentTax : taxList) {
            if (order.getState().equals(currentTax.getState())) {
                order.setTaxRate(currentTax.getTaxRate());
            }
        }

        if (order.getTaxRate() == null) {
            throw new OrderInvalidException("Invalid state");
        }

        for (Product currentProduct : productList) {
            if (order.getProductType().equals(currentProduct.getProductType())) {
                order.setCostPerSquareFoot(currentProduct.getCostPerSquareFoot());
                order.setLaborCostPerSquareFoot(currentProduct.getLaborCostPerSquareFoot());
            }
        }

        if (order.getCostPerSquareFoot() == null || order.getLaborCostPerSquareFoot() == null) {
            throw new OrderInvalidException("Invalid product type");
        }

//        if (order.getState().equals(taxDao.readByState(order.getState()))) {
//            order.setTaxRate(taxDao.readByState(order.getState()).getTaxRate());
//        }
//
//        if (order.getTaxRate() == null) {
//            throw new OrderInvalidException("(*** Invalid state. Please Enter a valid state ***");
//        }
//
//        if (order.getProductType().equals(productDao.readByType(order.getProductType()))) {
//            order.setCostPerSquareFoot(productDao.readByType(order.getProductType()).getCostPerSquareFoot());
//            order.setLaborCostPerSquareFoot(productDao.readByType(order.getProductType()).getLaborCostPerSquareFoot());
//        }
//
//        if (order.getCostPerSquareFoot() == null || order.getLaborCostPerSquareFoot() == null) {
//            throw new OrderInvalidException("*** Invalid product. Please Enter a valid product ***");
//        }
        BigDecimal area = order.getArea().setScale(2, RoundingMode.HALF_UP);
        BigDecimal cpsf = order.getCostPerSquareFoot().setScale(2, RoundingMode.HALF_UP);
        BigDecimal lcpsf = order.getLaborCostPerSquareFoot().setScale(2, RoundingMode.HALF_UP);

        BigDecimal materialCost = area.multiply(cpsf).setScale(2, RoundingMode.HALF_UP);
        order.setMaterialCost(materialCost);
        BigDecimal laborCost = area.multiply(lcpsf).setScale(2, RoundingMode.HALF_UP);
        order.setLaborCost(laborCost);

        BigDecimal subtotal = materialCost.add(laborCost);

        BigDecimal taxPercentage = order.getTaxRate().divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP);
        BigDecimal tax = taxPercentage.multiply(subtotal).setScale(2, RoundingMode.HALF_UP);
        order.setTax(tax);

        BigDecimal total = materialCost.add(laborCost).add(tax).setScale(2, RoundingMode.HALF_UP);
        order.setTotal(total);

        return order;
    }

    @Override
    public List<Tax> displayTaxes() throws DaoPersistenceException {
        return taxDao.readAllTaxes();
    }

    @Override
    public List<Product> displayProducts() throws DaoPersistenceException {
        return productDao.readAllProducts();
    }

}
