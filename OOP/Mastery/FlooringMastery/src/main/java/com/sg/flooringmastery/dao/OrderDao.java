/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface OrderDao {

    //CRRUD
    public Order createOrder(LocalDate date, Order order) throws DaoPersistenceException;

    public List<Order> readAllOrders(LocalDate date) throws DaoPersistenceException;

    public Order readOrderById(LocalDate date, int orderNumber) throws DaoPersistenceException;

    public void updateOrder(LocalDate date, int orderNumber, Order order) throws DaoPersistenceException;

    public void deleteOrder(LocalDate date, int orderNumber) throws DaoPersistenceException;

    public void saveOrder() throws DaoPersistenceException;

    public List<Order> getExistingOrders(LocalDate date) throws DaoPersistenceException;

}
