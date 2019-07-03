/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.service.VendingMachineOutOfStockException;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.view.VendingMachineView;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Qube
 */
public class VendingMachineController {

    private VendingMachineView view;
    private VendingMachineServiceLayer service;

    public VendingMachineController(VendingMachineView view, VendingMachineServiceLayer service) {
        this.view = view;
        this.service = service;
    }

    public void run() {
        boolean keepGoing = true;
        String menuSelection = "";

        try {
            while (keepGoing) {
                displayMenu();
                insertBalance();
                menuSelection = getMenuSelection();

                if (menuSelection.equals("exit")) {
                    displayExitBanner();
                    keepGoing = false;
                } else {
                    vend(menuSelection);
                    displayExitBanner();
                    keepGoing = false;
                }
            }
//        } catch (VendingMachinePersistenceException e) {
        } catch (Exception e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void displayMenu() throws VendingMachinePersistenceException {
        view.displayIntroBanner();
        List<Item> items = service.getAvailableItems();
        view.displayItem(items);
    }

    private void insertBalance() {
        BigDecimal balance = view.getBalance();
        service.setBalance(balance);
    }

    private String getMenuSelection() throws VendingMachinePersistenceException {
        List<Item> items = service.getAvailableItems();
        return view.getMenuSelection(items);
    }

    private void displayExitBanner() {
        view.displayExitBanner();
    }

    private void vend(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineOutOfStockException {
        Change change = service.vend(itemId);
        view.displayChange(change);
    }

}
