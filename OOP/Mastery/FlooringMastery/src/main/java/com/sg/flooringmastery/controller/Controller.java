/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.controller;

import com.sg.flooringmastery.dao.DaoPersistenceException;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Product;
import com.sg.flooringmastery.dto.Tax;
import com.sg.flooringmastery.service.OrderInvalidException;
import com.sg.flooringmastery.service.OrderNotFoundException;
import com.sg.flooringmastery.service.OrderValidationException;
import com.sg.flooringmastery.service.Service;
import com.sg.flooringmastery.view.View;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Qube
 */
public class Controller {

    private View view;
    private Service service;

    public Controller(View view, Service service) {
        this.view = view;
        this.service = service;
    }

    public void run() {
        getUserSelection();
    }

    private void getUserSelection() {
        boolean keepGoing = true;
        int menuSelection = 0;

        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        displayOrders(menuSelection);
                        break;
                    case 2:
                        addOrder(menuSelection);
                        break;
                    case 3:
                        editOrder(menuSelection);
                        break;
                    case 4:
                        removeOrder(menuSelection);
                        break;
                    case 5:
//                        TODO FIX
//                        Save current work
                        saveOrder(menuSelection);
                        break;
                    case 6:
                        quitProgram(menuSelection);
                        keepGoing = false;
                        break;
                    default:
                }
            }
        } catch (DaoPersistenceException | OrderValidationException | OrderNotFoundException | OrderInvalidException e) {
            view.displayError(e);
            getUserSelection();
        }
    }

    private int getMenuSelection() {
        return view.displayMenuAndGetSelection();
    }

    private void displayOrders(int menuSelection) throws DaoPersistenceException {
        view.displayBanner(menuSelection);

        LocalDate date = view.getDate();
        List<Order> orderList = service.displayOrders(date);
        view.displayOrderList(orderList);
    }

    private void addOrder(int menuSelection) throws DaoPersistenceException, OrderValidationException, OrderInvalidException {
        view.displayBanner(menuSelection);

        List<Tax> taxList = service.displayTaxes();
        List<Product> productList = service.displayProducts();
        view.displayTaxAndProductList(taxList, productList);

        Order order = view.getOrderInfo();
        if (order != null) {
            service.addOrder(order);
        }
    }

    private void editOrder(int menuSelection) throws DaoPersistenceException, OrderNotFoundException, OrderValidationException, OrderInvalidException {
        view.displayBanner(menuSelection);

        LocalDate date = view.getDate();
        int orderNumber = view.getOrderNumber();
        Order order = service.getOrder(date, orderNumber);
        Order updatedOrder = view.getUpdatedInfo(order);
        service.editOrder(date, orderNumber, updatedOrder);
    }

    private void removeOrder(int menuSelection) throws DaoPersistenceException, OrderNotFoundException {
        view.displayBanner(menuSelection);

        LocalDate date = view.getDate();
        int orderNumber = view.getOrderNumber();
        Order order = service.getOrder(date, orderNumber);
        boolean removeOrder = view.removeOrder(order);
        if (removeOrder) {
            service.removeOrder(date, orderNumber);
        }
    }

    private void saveOrder(int menuSelection) throws DaoPersistenceException {
        view.displayBanner(menuSelection);
        service.save();
    }

    private void quitProgram(int menuSelection) {
        view.displayBanner(menuSelection);
    }
}
