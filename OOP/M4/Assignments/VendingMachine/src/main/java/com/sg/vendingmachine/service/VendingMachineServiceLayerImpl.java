/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    private BigDecimal balance;
    private VendingMachineDao dao;
    private VendingMachineAuditDao auditDao;

    public VendingMachineServiceLayerImpl(VendingMachineDao dao, VendingMachineAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public List<Item> getAvailableItems() throws VendingMachinePersistenceException {
        return dao.readAll();
    }

    @Override
    public Item getItemById(String itemId) throws VendingMachinePersistenceException {
        return dao.readById(itemId);
    }

    @Override
    public void updateInventory(String itemId, Item item) throws VendingMachinePersistenceException {
        dao.updateInventory(itemId, item);
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public Change vend(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineOutOfStockException {
        Item item = dao.readById(itemId);
        BigDecimal price = item.getItemPrice();
        Change change;

        if (item.getItemCount() != 0) {
            if (balance.compareTo(price) != -1) {
                item.setItemCount(item.getItemCount() - 1);
                updateInventory(itemId, item);
                change = calculateChange(balance.subtract(price));
            } else {
//                auditDao.writeAuditEntry("You lack the funds to purchase " + itemId);
                String message = item.toString() + ". Sir you lack the neccessary funds.";
                throw new VendingMachineInsufficientFundsException(message);
            }
        } else {
//            auditDao.writeAuditEntry("Option " + itemId + " not in stock!");
            String message = item.toString() + ". So sorry good sir we ran out of this item.";
            throw new VendingMachineOutOfStockException(message);
        }
//        if (balance.compareTo(price) != -1) {
//            item.setItemCount(item.getItemCount() - 1);
//            updateInventory(itemId, item);
//            change = calculateChange(balance.subtract(price));
//        } else {
//            throw new VendingMachineInsufficientFundsException("Sir you lack the neccessary funds.");
//        }

        balance = null;

        return change;
    }

    @Override
    public Change calculateChange(BigDecimal calculateMyChange) {
        Change change = new Change();
        BigDecimal penny = new BigDecimal(".01");
        BigDecimal nickel = new BigDecimal(".05");
        BigDecimal dime = new BigDecimal(".10");
        BigDecimal quarter = new BigDecimal(".25");

        if (calculateMyChange.compareTo(quarter) != -1) {
            int quarters = calculateMyChange.divide(quarter, RoundingMode.FLOOR).intValue();
            change.setQuarters(quarters);
            calculateMyChange = calculateMyChange.subtract(quarter.multiply(new BigDecimal(quarters)));
        }

        if (calculateMyChange.compareTo(dime) != -1) {
            int dimes = calculateMyChange.divide(dime, RoundingMode.FLOOR).intValue();
            change.setQuarters(dimes);
            calculateMyChange = calculateMyChange.subtract(dime.multiply(new BigDecimal(dimes)));
        }

        if (calculateMyChange.compareTo(nickel) != -1) {
            int nickels = calculateMyChange.divide(nickel, RoundingMode.FLOOR).intValue();
            change.setQuarters(nickels);
            calculateMyChange = calculateMyChange.subtract(nickel.multiply(new BigDecimal(nickels)));
        }

        if (calculateMyChange.compareTo(penny) != -1) {
            int pennies = calculateMyChange.divide(penny, RoundingMode.FLOOR).intValue();
            change.setQuarters(pennies);
            calculateMyChange = calculateMyChange.subtract(penny.multiply(new BigDecimal(pennies)));
        }

        return change;
    }

}
