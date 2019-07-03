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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Qube
 */
public class ProductDaoTest {

    private ProductDao productDao;

    public ProductDaoTest() throws DaoPersistenceException {
        productDao = new ProductDaoImpl();
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
     * Test of readAllProducts method, of class ProductDao.
     */
    @Test
    public void testReadAllProducts() throws Exception {
        assertEquals(4, productDao.readAllProducts().size());
    }

    /**
     * Test of readByType method, of class ProductDao.
     */
    @Test
    public void testReadByType() throws Exception {
        assertNotNull(productDao.readByType("Carpet"));
        assertEquals(new BigDecimal("2.10"), productDao.readByType("Carpet").getLaborCostPerSquareFoot());

        assertNotNull(productDao.readByType("Laminate"));
        assertEquals(new BigDecimal("1.75"), productDao.readByType("Laminate").getCostPerSquareFoot());

        assertNotNull(productDao.readByType("Tile"));
        assertEquals(new BigDecimal("3.50"), productDao.readByType("Tile").getCostPerSquareFoot());

        assertNotNull(productDao.readByType("Wood"));
        assertEquals(new BigDecimal("5.15"), productDao.readByType("Wood").getCostPerSquareFoot());
        assertEquals(new BigDecimal("4.75"), productDao.readByType("Wood").getLaborCostPerSquareFoot());
    }

}
