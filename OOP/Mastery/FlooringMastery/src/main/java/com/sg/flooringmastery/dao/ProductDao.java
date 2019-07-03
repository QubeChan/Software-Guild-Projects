/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Product;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface ProductDao {

    /**
     *
     * @param productType
     * @return the Product object associated with the given productType id, null
     * if no such Product exists
     * @throws TaxPersistenceException
     */
    public List<Product> readAllProducts() throws DaoPersistenceException;

    public Product readByType(String productType) throws DaoPersistenceException;

}
