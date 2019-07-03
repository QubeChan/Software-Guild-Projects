/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.view;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Qube
 */
public class VendingMachineView {

    private UserIO io;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String message) {
        io.print("=== ERROR ===\n" + message);
    }

    public void displayIntroBanner() {
        io.print("==== Welcome to Qube's Veending Machine ===");
    }

    public void displayItem(List<Item> itemList) {
        for (Item currentItem : itemList) {
            io.print(currentItem.getItemId() + ": "
                    + currentItem.getItemName() + " - $"
                    + currentItem.getItemPrice() + " - Item Count: "
                    + currentItem.getItemCount()
                    + "\n");
        }
    }

    public BigDecimal getBalance() {
        return io.readBigDecimal("How much money do you wish to insert?");
    }

    public String getMenuSelection(List<Item> items) {
        String userInput = io.readString("Please select an item to be vended good sir!\n"
                + "If you'd like to leave please type 'exit'.");
        //finish up
        if (userInput.trim().toLowerCase().equals("exit")) {
            return "exit";
        } else {
            return userInput;
        }
    }

    public void displayExitBanner() {
        io.print("Thanks for checking out Qube's wares!");
    }

    public void displayChange(Change change) {
        io.print("Here's your change:\n"
                + "Quarters: " + change.getQuarters() + "\n"
                + "Dimes: " + change.getDimes() + "\n"
                + "Nickels: " + change.getNickels() + "\n"
                + "Pennies: " + change.getPennies());
    }

}
