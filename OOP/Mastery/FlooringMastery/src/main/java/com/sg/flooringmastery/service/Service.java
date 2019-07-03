/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.DaoPersistenceException;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Product;
import com.sg.flooringmastery.dto.Tax;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface Service {

    public List<Order> displayOrders(LocalDate date) throws DaoPersistenceException;

    public void addOrder(Order order) throws DaoPersistenceException, OrderValidationException, OrderInvalidException;

    public void editOrder(LocalDate date, int orderNumber, Order newOrder) throws DaoPersistenceException, OrderNotFoundException, OrderValidationException, OrderInvalidException;

    public void removeOrder(LocalDate date, int orderNumber) throws DaoPersistenceException;

    public void save() throws DaoPersistenceException;

    public Order getOrder(LocalDate date, int orderNumber) throws DaoPersistenceException, OrderNotFoundException;

    public List<Tax> displayTaxes() throws DaoPersistenceException;

    public List<Product> displayProducts() throws DaoPersistenceException;
}
