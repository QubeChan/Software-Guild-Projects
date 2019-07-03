/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface VendingMachineServiceLayer {

    public List<Item> getAvailableItems() throws VendingMachinePersistenceException;
    
    public Item getItemById(String itemId) throws VendingMachinePersistenceException;
    
    public void updateInventory(String itemId, Item item) throws VendingMachinePersistenceException;

    public void setBalance(BigDecimal balance);

    public BigDecimal getBalance();

    public Change vend(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineOutOfStockException;
    
    public Change calculateChange(BigDecimal change);
}
