/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qube
 */
public class VendingMachineDaoTest {

    private VendingMachineDao dao = new VendingMachineDaoStubImpl();

    public VendingMachineDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of readAll method, of class VendingMachineDao.
     */
    @Test
    public void testReadAll() throws Exception {
        assertEquals(2, dao.readAll().size());
    }

    /**
     * Test of readById method, of class VendingMachineDao.
     */
    @Test
    public void testReadById() throws Exception {
        assertNotNull(dao.readById("1"));
        assertNotNull(dao.readById("2"));
        assertNull(dao.readById("3"));
    }

    /**
     * Test of updateInventory method, of class VendingMachineDao.
     */
    @Test
    public void testUpdateInventory() throws Exception {
        Item item = new Item("1");
        item.setItemName("Coke");
        item.setItemPrice(new BigDecimal("1.50"));
        item.setItemCount(0);

        dao.updateInventory("1", item);

        assertEquals(item.getItemId(), dao.readById("1").getItemId());
        
        assertNotEquals("Diet Coke", dao.readById("1").getItemName());
        assertNotEquals("1.75", dao.readById("1").getItemPrice().toString());
        assertNotEquals("2",dao.readById("1").getItemCount());
        
        assertEquals("Coke", dao.readById("1").getItemName());
        assertEquals("1.50", dao.readById("1").getItemPrice().toString());
        assertEquals(0,dao.readById("1").getItemCount());
    }

}
