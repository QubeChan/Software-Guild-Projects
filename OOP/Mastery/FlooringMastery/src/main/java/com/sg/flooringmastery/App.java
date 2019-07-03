/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery;

import com.sg.flooringmastery.controller.Controller;
import com.sg.flooringmastery.dao.DaoPersistenceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Qube
 */
public class App {

    public static void main(String[] args) throws DaoPersistenceException {
//        UserIO io = new UserIOImpl();
//        View view = new View(io);
//        TaxDao taxDao = new TaxDaoImpl();
//        ProductDao productDao = new ProductDaoImpl();
//        OrderDao orderDao = new OrderDaoProdImpl();
//        Service service = new ServiceImpl(taxDao, productDao, orderDao);
//        Controller controller = new Controller(view, service);
//        controller.run();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Controller controller = ctx.getBean("controller", Controller.class);
        controller.run();
    }
}
