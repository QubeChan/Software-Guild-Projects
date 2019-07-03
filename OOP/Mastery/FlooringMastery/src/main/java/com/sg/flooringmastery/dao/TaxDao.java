/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Tax;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface TaxDao {

    /**
     *
     * @param state
     * @return the Tax object associated with the given state id, null if no
     * such Tax exists
     * @throws TaxPersistenceException
     */
    public List<Tax> readAllTaxes() throws DaoPersistenceException;

    public Tax readByState(String state) throws DaoPersistenceException;
}
