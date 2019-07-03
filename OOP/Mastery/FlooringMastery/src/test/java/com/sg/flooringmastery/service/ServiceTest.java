/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.DaoPersistenceException;
import com.sg.flooringmastery.dao.OrderDao;
import com.sg.flooringmastery.dao.OrderDaoProdImpl;
import com.sg.flooringmastery.dao.ProductDao;
import com.sg.flooringmastery.dao.ProductDaoImpl;
import com.sg.flooringmastery.dao.TaxDao;
import com.sg.flooringmastery.dao.TaxDaoImpl;
import com.sg.flooringmastery.dto.Order;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Qube
 */
public class ServiceTest {

    private Service service;

    public ServiceTest() throws DaoPersistenceException {
        TaxDao taxDao = new TaxDaoImpl();
        ProductDao productDao = new ProductDaoImpl();
        OrderDao orderDao = new OrderDaoProdImpl();

        service = new ServiceImpl(taxDao, productDao, orderDao);
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
     * Test of displayOrders method, of class Service.
     */
    @Test
    public void testDisplayOrders() throws Exception {
        LocalDate date = LocalDate.parse("2019-03-01");
        List<Order> order = service.displayOrders(date);

        assertEquals(1, order.size());
        assertEquals(2, order.get(0).getOrderNumber());
    }

    /**
     * Test of addOrder method, of class Service.
     */
    @Test
    public void testAddOrder() throws Exception {
//        Order order = new Order(0);
//        order.setCustomerName("Jason");
//        order.setState("PA");
//        order.setProductType("Wood");
//        order.setArea(new BigDecimal("100"));
//
//        service.addOrder(order);
//        Order serviceOrder = service.getOrder(LocalDate.now(), 1);
//
//        assertEquals(serviceOrder, order);
//        assertEquals(1, serviceOrder.getOrderNumber());
//        assertEquals(new BigDecimal("6.75"), serviceOrder.getTaxRate());
//        assertEquals(new BigDecimal("5.15"), serviceOrder.getCostPerSquareFoot());
//        assertEquals(new BigDecimal("4.75"), serviceOrder.getLaborCostPerSquareFoot());
//        assertEquals(new BigDecimal("515.00"), serviceOrder.getMaterialCost());
//        assertEquals(new BigDecimal("475.00"), serviceOrder.getLaborCost());
//        assertEquals(new BigDecimal("66.83"), serviceOrder.getTax());
//        assertEquals(new BigDecimal("1056.83"), serviceOrder.getTotal());
    }

    /**
     * Test of editOrder method, of class Service.
     */
    @Test
    public void testEditOrder() throws Exception {
//        Order order = new Order(0);
//        order.setCustomerName("Jason");
//        order.setState("PA");
//        order.setProductType("Wood");
//        order.setArea(new BigDecimal("100"));
//
//        service.addOrder(order);
//
//        Order updateOrder = service.getOrder(LocalDate.now(), 1);
//        updateOrder.setCustomerName("John");
//        updateOrder.setState("OH");
//        updateOrder.setProductType("Tile");
//
//        service.editOrder(LocalDate.now(), 1, updateOrder);
//
//        Order serviceOrder = service.getOrder(LocalDate.now(), 1);
//        assertEquals(1, serviceOrder.getOrderNumber());
//        assertEquals("OH", serviceOrder.getState());
//        assertEquals("Tile", serviceOrder.getProductType());
//        assertEquals(new BigDecimal("100"), serviceOrder.getArea());
//        assertEquals(new BigDecimal("812.81"), serviceOrder.getTotal());
    }

    /**
     * Test of removeOrder method, of class Service.
     */
    @Test
    public void testRemoveOrder() throws Exception {
    }

    /**
     * Test of save method, of class Service.
     */
    @Test
    public void testSave() throws Exception {
//        Order order = new Order(0);
//        order.setCustomerName("Jason");
//        order.setState("PA");
//        order.setProductType("Wood");
//        order.setArea(new BigDecimal("100"));
//
//        service.addOrder(order);
//        service.save();
//
//        assertEquals(order, service.getOrder(LocalDate.now(), 1));
//        service.removeOrder(LocalDate.now(), 1);
//        service.save();
    }

}
