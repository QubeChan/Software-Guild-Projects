/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

/**
 *
 * @author Qube
 */
public class VendingMachineOutOfStockException extends Exception {

    public VendingMachineOutOfStockException(String message) {
        super(message);
    }

    public VendingMachineOutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }
}
