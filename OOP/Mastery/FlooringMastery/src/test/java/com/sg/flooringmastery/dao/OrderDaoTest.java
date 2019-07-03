/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Order;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Qube
 */
public class OrderDaoTest {

    private OrderDao orderDao;

    public OrderDaoTest() throws DaoPersistenceException {
        orderDao = new OrderDaoProdImpl();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws DaoPersistenceException {
        LocalDate date = LocalDate.parse("2019-03-05");
        List<Order> orderList = orderDao.readAllOrders(date);
        for (Order order : orderList) {
            orderDao.deleteOrder(date, order.getOrderNumber());
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createOrder method, of class OrderDao.
     */
    @Test
    public void testCreateOrderAndReadOrder() throws Exception {
        Order order = new Order(1);
        order.setCustomerName("John");
        order.setState("OH");
        order.setTaxRate(new BigDecimal("6.25"));
        order.setProductType("Carpet");
        order.setArea(new BigDecimal("100"));
        order.setCostPerSquareFoot(new BigDecimal("2.25"));
        order.setLaborCostPerSquareFoot(new BigDecimal("2.10"));
        order.setMaterialCost(new BigDecimal("225"));
        order.setLaborCost(new BigDecimal("210"));
        order.setTax(new BigDecimal("27.19"));
        order.setTotal(new BigDecimal("462.19"));

        LocalDate date = LocalDate.parse("2019-03-01");

        orderDao.createOrder(date, order);

        Order daoOrder = orderDao.readOrderById(date, 1);
        assertEquals(daoOrder, order);

        Order order2 = new Order(2);
        order2.setCustomerName("Jane");
        order2.setState("PA");
        order2.setTaxRate(new BigDecimal("6.75"));
        order2.setProductType("Wood");
        order2.setArea(new BigDecimal("1000"));
        order2.setCostPerSquareFoot(new BigDecimal("5.15"));
        order2.setLaborCostPerSquareFoot(new BigDecimal("4.75"));
        order2.setMaterialCost(new BigDecimal("5150"));
        order2.setLaborCost(new BigDecimal("4750"));
        order2.setTax(new BigDecimal("668.25"));
        order2.setTotal(new BigDecimal("10568.25"));

        orderDao.createOrder(date, order2);

        daoOrder = orderDao.readOrderById(date, 2);
        assertEquals(daoOrder, order2);
    }

    /**
     * Test of readAllOrders method, of class OrderDao.
     */
    @Test
    public void testReadAllOrders() throws Exception {
        Order order = new Order(1);
        order.setCustomerName("John");
        order.setState("OH");
        order.setTaxRate(new BigDecimal("6.25"));
        order.setProductType("Carpet");
        order.setArea(new BigDecimal("100"));
        order.setCostPerSquareFoot(new BigDecimal("2.25"));
        order.setLaborCostPerSquareFoot(new BigDecimal("2.10"));
        order.setMaterialCost(new BigDecimal("225"));
        order.setLaborCost(new BigDecimal("210"));
        order.setTax(new BigDecimal("27.19"));
        order.setTotal(new BigDecimal("462.19"));

        Order order2 = new Order(2);
        order2.setCustomerName("Jane");
        order2.setState("PA");
        order2.setTaxRate(new BigDecimal("6.75"));
        order2.setProductType("Wood");
        order2.setArea(new BigDecimal("1000"));
        order2.setCostPerSquareFoot(new BigDecimal("5.15"));
        order2.setLaborCostPerSquareFoot(new BigDecimal("4.75"));
        order2.setMaterialCost(new BigDecimal("5150"));
        order2.setLaborCost(new BigDecimal("4750"));
        order2.setTax(new BigDecimal("668.25"));
        order2.setTotal(new BigDecimal("10568.25"));

        LocalDate date = LocalDate.parse("2019-03-01");

        orderDao.createOrder(date, order);
        orderDao.createOrder(date, order2);
        orderDao.saveOrder();

        assertEquals(1, orderDao.readAllOrders(date).size());
    }

    /**
     * Test of updateOrder method, of class OrderDao.
     */
    @Test
    public void testUpdateOrder() throws Exception {
        Order order = new Order(1);
        order.setCustomerName("John");
        order.setState("OH");
        order.setTaxRate(new BigDecimal("6.25"));
        order.setProductType("Carpet");
        order.setArea(new BigDecimal("100"));
        order.setCostPerSquareFoot(new BigDecimal("2.25"));
        order.setLaborCostPerSquareFoot(new BigDecimal("2.10"));
        order.setMaterialCost(new BigDecimal("225"));
        order.setLaborCost(new BigDecimal("210"));
        order.setTax(new BigDecimal("27.19"));
        order.setTotal(new BigDecimal("462.19"));

        LocalDate date = LocalDate.parse("2019-03-01");

        orderDao.createOrder(date, order);
        orderDao.saveOrder();

        Order updateOrder = new Order(1);
        updateOrder.setCustomerName("Randal Clapper");
        updateOrder.setState("PA");
        updateOrder.setTaxRate(new BigDecimal("6.25"));
        updateOrder.setProductType("Wood");
        updateOrder.setArea(new BigDecimal("1000"));
        updateOrder.setCostPerSquareFoot(new BigDecimal("5.15"));
        updateOrder.setLaborCostPerSquareFoot(new BigDecimal("4.75"));
        updateOrder.setMaterialCost(new BigDecimal("5150"));
        updateOrder.setLaborCost(new BigDecimal("4750"));
        updateOrder.setTax(new BigDecimal("668.25"));
        updateOrder.setTotal(new BigDecimal("10568.25"));

        orderDao.updateOrder(date, 1, updateOrder);
        orderDao.saveOrder();

        Order daoOrder = orderDao.readOrderById(date, 1);

        assertEquals(updateOrder, daoOrder);
        assertNotEquals("John", daoOrder.getCustomerName());
    }

    /**
     * Test of deleteOrder method, of class OrderDao.
     */
    @Test
    public void testDeleteOrder() throws Exception {
        Order order = new Order(1);
        order.setCustomerName("John");
        order.setState("OH");
        order.setTaxRate(new BigDecimal("6.25"));
        order.setProductType("Carpet");
        order.setArea(new BigDecimal("100"));
        order.setCostPerSquareFoot(new BigDecimal("2.25"));
        order.setLaborCostPerSquareFoot(new BigDecimal("2.10"));
        order.setMaterialCost(new BigDecimal("225"));
        order.setLaborCost(new BigDecimal("210"));
        order.setTax(new BigDecimal("27.19"));
        order.setTotal(new BigDecimal("462.19"));

        LocalDate date = LocalDate.parse("2019-03-01");

        orderDao.createOrder(date, order);
        orderDao.saveOrder();

        assertEquals(1, orderDao.readAllOrders(date).size());
        assertNotNull(orderDao.readOrderById(date, 1));
        assertNull(orderDao.readOrderById(date, 2));
        
        orderDao.deleteOrder(date, 1);
        orderDao.saveOrder();
        
        assertEquals(0,orderDao.readAllOrders(date).size());
        assertNull(orderDao.readOrderById(date, 1));
    }

}
