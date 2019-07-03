/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

/**
 *
 * @author Qube
 */
public class OrderInvalidException extends Exception {

    public OrderInvalidException(String message) {
        super(message);
    }

    public OrderInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

}
