/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Qube
 */
public class TaxDaoTest {

    private TaxDao taxDao;

    public TaxDaoTest() throws DaoPersistenceException {
        taxDao = new TaxDaoImpl();
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
     * Test of readAllTaxes method, of class TaxDao.
     */
    @Test
    public void testReadAllTaxes() throws Exception {
        assertEquals(4, taxDao.readAllTaxes().size());
    }

    /**
     * Test of readByState method, of class TaxDao.
     */
    @Test
    public void testReadByState() throws Exception {
        assertNotNull(taxDao.readByState("OH"));
        assertEquals(new BigDecimal("6.25"), taxDao.readByState("OH").getTaxRate());

        assertNotNull(taxDao.readByState("PA"));
        assertEquals(new BigDecimal("6.75"), taxDao.readByState("PA").getTaxRate());

        assertNotNull(taxDao.readByState("MI"));
        assertEquals(new BigDecimal("5.75"), taxDao.readByState("MI").getTaxRate());

        assertNotNull(taxDao.readByState("IN"));
        assertEquals(new BigDecimal("6.00"), taxDao.readByState("IN").getTaxRate());

        assertNull(taxDao.readByState("NJ"));
    }

}
