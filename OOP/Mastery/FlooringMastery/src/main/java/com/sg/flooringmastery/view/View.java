/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.view;

import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Product;
import com.sg.flooringmastery.dto.Tax;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Qube
 */
public class View {

    private UserIO io;

    public View(UserIO io) {
        this.io = io;
    }

    public int displayMenuAndGetSelection() {
        io.print("* << Flooring Program >>\n"
                + "* 1. Display Orders\n"
                + "* 2. Add an Order\n"
                + "* 3. Edit an Order\n"
                + "* 4. Remove an Order\n"
                + "* 5. Save Current Work\n"
                + "* 6. Quit\n");
        return io.readInt("Please select from the following choices.", 1, 6);
    }

    public void displayBanner(int menuSelection) {
        switch (menuSelection) {
            case 1:
                io.print("**************************\n"
                        + "*** Display All Orders ***\n"
                        + "**************************");
                break;
            case 2:
                io.print("*****************\n"
                        + "*** Add Order ***\n"
                        + "*****************");
                break;
            case 3:
                io.print("******************\n"
                        + "*** Edit Order ***\n"
                        + "******************");
                break;
            case 4:
                io.print("********************\n"
                        + "*** Remove Order ***\n"
                        + "********************");
                break;
            case 5:
                io.print("******************\n"
                        + "*** Save Order ***\n"
                        + "******************");
                break;
            case 6:
                io.print("★─▄█▀▀║░▄█▀▄║▄█▀▄║██▀▄║─★\n"
                        + "★─██║▀█║██║█║██║█║██║█║─★\n"
                        + "★─▀███▀║▀██▀║▀██▀║███▀║─★\n"
                        + "★───────────────────────★\n"
                        + "★───▐█▀▄─ ▀▄─▄▀ █▀▀──█───★\n"
                        + "★───▐█▀▀▄ ──█── █▀▀──▀───★\n"
                        + "★───▐█▄▄▀ ──▀── ▀▀▀──▄───★");
                break;
            default:
        }

    }

    public LocalDate getDate() {
        return io.readLocalDate("Please enter a date formatted by MMddyyyy.");
    }

    public int getOrderNumber() {
        return io.readInt("Please enter the order number you wish to edit.");
    }

    public void displayOrderList(List<Order> orderList) {
        for (Order currentOrder : orderList) {
            displayOrder(currentOrder);
        }
    }

    public void displayOrder(Order order) {
        io.print("Order Num. " + order.getOrderNumber()
                + "\nCustomerName: " + order.getCustomerName()
                + "\nState: " + order.getState() + " | Tax Rate: " + order.getTaxRate() + "%"
                + "\nProduct Type: " + order.getProductType() + " | Area: " + order.getArea()
                + "\nCost Per Square Foot: $" + order.getCostPerSquareFoot()
                + " | Labor Cost Per Square Foot: $" + order.getLaborCostPerSquareFoot()
                + "\nMaterial Cost: $" + order.getMaterialCost() + " | Labor Cost: $" + order.getLaborCost()
                + "\nTax: $" + order.getTax() + " | Total: $" + order.getTotal() + "\n");
    }

    public void displayTaxAndProductList(List<Tax> taxList, List<Product> productList) {
        io.print("States we are currently stationed at and the tax rates:");
        for (Tax currentTax : taxList) {
            io.print(currentTax.getState() + ", " + currentTax.getTaxRate() + "%");
        }
        io.print("\nThese are the follow products we carry on hand:");
        for (Product currentProduct : productList) {
            io.print(currentProduct.getProductType() + ": $" + currentProduct.getCostPerSquareFoot() + " per square foot and $" + currentProduct.getLaborCostPerSquareFoot() + " labor cost per square foot");
        }
        io.print("");
    }

    public Order getOrderInfo() {
        Order order = new Order(0);

        order.setCustomerName(io.readString("Customer Name: "));
        order.setState(io.readString("Please enter your state abbreviated from the list:"));
        order.setProductType(io.readString("Please enter the product you would like to place for your order:"));
        order.setArea(io.readBigDecimal("Please enter the area of flooring you are planning to do in square feet:"));

        io.print("Please verify that the following data is correct:"
                + "\nCustomer Name: " + order.getCustomerName()
                + "\nState: " + order.getState()
                + "\nProduct: " + order.getProductType()
                + "\nArea: " + order.getArea() + " square feet\n");

        String choice;
        do {
            choice = io.readString("If the data entered is correct, please enter 'Y' to confirm the order."
                    + "\nElse if the data is incorrect, please enter 'N' to discard the order.");
            if (choice.equalsIgnoreCase("Y")) {
                io.print("The data has been confirmed but make sure to save your work on the main menu to save the changes!\n");
                return order;
            } else if (choice.equalsIgnoreCase("N")) {
                io.print("The data was incorrect and the order has been discarded.\n");
                return null;
            }
        } while (!choice.equalsIgnoreCase("Y") || !choice.equalsIgnoreCase("N"));
        io.print("The order has been discarded.\n");

        return null;
    }

    public Order getUpdatedInfo(Order order) {
        Order updatedOrder = new Order(order.getOrderNumber());

        io.print("Current Customer Name: " + order.getCustomerName());
        order.setCustomerName(io.readString("Please enter new customer name: "));
        io.print("Current State: " + order.getState());
        order.setState(io.readString("Please enter new state abbreviated:"));
        io.print("Current Product: " + order.getProductType());
        order.setProductType(io.readString("Please enter new product type:"));
        io.print("Current Area: " + order.getArea());
        order.setArea(io.readBigDecimal("Please enter new area of flooring you are planning to do in square feet:"));

        return updatedOrder;
    }

    public boolean removeOrder(Order order) {
        io.print("Is this the order you'd like to remove?"
                + "\n");
        displayOrder(order);

        String choice;
        do {
            choice = io.readString("If this is the order please enter 'Y' to remove."
                    + "\nElse if this is not the order please enter 'N' to keep.");
            if (choice.equalsIgnoreCase("Y")) {
                io.print("Order has been deleted!\n");
                return true;
            } else if (choice.equalsIgnoreCase("N")) {
                io.print("Order has not been deleted!\n");
                return false;
            }
        } while (!choice.equalsIgnoreCase("Y") || !choice.equalsIgnoreCase("N"));
        io.print("Order has not been deleted!\n");

        return false;
    }

    public void displayError(Exception e){
        System.out.println(e.getMessage());
    }
}
