/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDaoProdImpl implements OrderDao {

    private Map<LocalDate, Map<Integer, Order>> orders = new HashMap<>();
    public static final String ORDERS_FILE = "Orders_",
            DELIMITER = ",";

    public OrderDaoProdImpl() throws DaoPersistenceException {
    }

    @Override
    public Order createOrder(LocalDate date, Order order) throws DaoPersistenceException {
        //test
        System.out.println(date);

        Map<Integer, Order> currentOrder = new HashMap<>();
        currentOrder.put(order.getOrderNumber(), order);
        orders.put(date, currentOrder);
        return order;
    }

    @Override
    public List<Order> readAllOrders(LocalDate date) throws DaoPersistenceException {
        loadOrders(date);
        return new ArrayList<Order>(orders.get(date).values());
    }

    @Override
    public Order readOrderById(LocalDate date, int orderNumber) throws DaoPersistenceException {

//        loadOrders(date);
        if (orders.containsKey(date)) {
            if (orders.get(date).containsKey(orderNumber)) {
                return orders.get(date).get(orderNumber);
            }

        } else {
            loadOrders(date);
            if (orders.containsKey(date)) {
                if (orders.get(date).containsKey(orderNumber)) {
                    return orders.get(date).get(orderNumber);
                }
            }
        }
        return null;
    }

    @Override
    public void updateOrder(LocalDate date, int orderNumber, Order order) throws DaoPersistenceException {
        orders.get(date).put(order.getOrderNumber(), order);
    }

    @Override
    public void deleteOrder(LocalDate date, int orderNumber) throws DaoPersistenceException {
        orders.get(date).remove(orderNumber);
    }

    @Override
    public void saveOrder() throws DaoPersistenceException {
        for (LocalDate date : orders.keySet()) {
            try {
                writeOrders(date);
            } catch (IOException ex) {
                throw new DaoPersistenceException("Could not write to file");
            }
        }
    }

    @Override
    public List<Order> getExistingOrders(LocalDate date) throws DaoPersistenceException {
        Map<Integer, Order> currentOrders;

        try {
            if (orders.containsKey(date)) {
                currentOrders = orders.get(date);
                return new ArrayList<>(currentOrders.values());
            } else {
                currentOrders = loadExistingOrders(date);
                orders.put(date, currentOrders);
                return new ArrayList<>(currentOrders.values());
            }
        } catch (DaoPersistenceException e) {
            return null;
        }
    }

    private void loadOrders(LocalDate date) throws DaoPersistenceException {
        Map<Integer, Order> ordersByDate = new HashMap<>();
        String stringDate = date.format(DateTimeFormatter.ofPattern("MMddyyyy"));
        String fileName = ORDERS_FILE + stringDate + ".txt";
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(fileName)));
        } catch (FileNotFoundException e) {
            throw new DaoPersistenceException("*** Could not load orders data into memory. ***");
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Order currentOrder = new Order(Integer.parseInt(currentTokens[0]));
            currentOrder.setCustomerName(currentTokens[1]);
            currentOrder.setState(currentTokens[2]);
            currentOrder.setTaxRate(new BigDecimal(currentTokens[3]));
            currentOrder.setProductType(currentTokens[4]);
            currentOrder.setArea(new BigDecimal(currentTokens[5]));
            currentOrder.setCostPerSquareFoot(new BigDecimal(currentTokens[6]));
            currentOrder.setLaborCostPerSquareFoot(new BigDecimal(currentTokens[7]));
            currentOrder.setMaterialCost(new BigDecimal(currentTokens[8]));
            currentOrder.setLaborCost(new BigDecimal(currentTokens[9]));
            currentOrder.setTax(new BigDecimal(currentTokens[10]));
            currentOrder.setTotal(new BigDecimal(currentTokens[11]));

            ordersByDate.put(currentOrder.getOrderNumber(), currentOrder);
        }
        orders.put(date, ordersByDate);

        scanner.close();
    }

    private Map loadExistingOrders(LocalDate date) throws DaoPersistenceException {
        Map<Integer, Order> ordersByDate = new HashMap<>();
        String stringDate = date.format(DateTimeFormatter.ofPattern("MMddyyyy"));
        String fileName = ORDERS_FILE + stringDate + ".txt";
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(fileName)));
        } catch (FileNotFoundException e) {
            throw new DaoPersistenceException("*** Could not load orders data into memory. ***");
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Order currentOrder = new Order(Integer.parseInt(currentTokens[0]));
            currentOrder.setCustomerName(currentTokens[1]);
            currentOrder.setState(currentTokens[2]);
            currentOrder.setTaxRate(new BigDecimal(currentTokens[3]));
            currentOrder.setProductType(currentTokens[4]);
            currentOrder.setArea(new BigDecimal(currentTokens[5]));
            currentOrder.setCostPerSquareFoot(new BigDecimal(currentTokens[6]));
            currentOrder.setLaborCostPerSquareFoot(new BigDecimal(currentTokens[7]));
            currentOrder.setMaterialCost(new BigDecimal(currentTokens[8]));
            currentOrder.setLaborCost(new BigDecimal(currentTokens[9]));
            currentOrder.setTax(new BigDecimal(currentTokens[10]));
            currentOrder.setTotal(new BigDecimal(currentTokens[11]));

            ordersByDate.put(currentOrder.getOrderNumber(), currentOrder);
        }
        orders.put(date, ordersByDate);

        scanner.close();

        return ordersByDate;
    }

    private void writeOrders(LocalDate date) throws DaoPersistenceException, IOException {
        String stringDate = date.format(DateTimeFormatter.ofPattern("MMddyyyy")),
                fileName = ORDERS_FILE + stringDate + ".txt";
        PrintWriter out;
        try {
            out = new PrintWriter(
                    new FileWriter(fileName));
        } catch (IOException e) {
            throw new DaoPersistenceException("*** Could not save order data into memory ***", e);
        }

        List<Order> orderList = new ArrayList<>(orders.get(date).values());
        for (Order currentOrder : orderList) {
            out.println(currentOrder.getOrderNumber() + DELIMITER
                    + currentOrder.getCustomerName() + DELIMITER
                    + currentOrder.getState() + DELIMITER
                    + currentOrder.getTaxRate() + DELIMITER
                    + currentOrder.getProductType() + DELIMITER
                    + currentOrder.getArea() + DELIMITER
                    + currentOrder.getCostPerSquareFoot() + DELIMITER
                    + currentOrder.getLaborCostPerSquareFoot() + DELIMITER
                    + currentOrder.getMaterialCost() + DELIMITER
                    + currentOrder.getLaborCost() + DELIMITER
                    + currentOrder.getTax() + DELIMITER
                    + currentOrder.getTotal());
            out.flush();
        }
        out.close();
    }

}
