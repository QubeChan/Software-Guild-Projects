/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Tax;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TaxDaoImpl implements TaxDao {

    private Map<String, Tax> taxes = new HashMap<>();
    public static final String TAXES_FILE = "Taxes.txt",
            DELIMITER = ",";

    public TaxDaoImpl() throws DaoPersistenceException {
        loadTaxs();
    }

    @Override
    public List<Tax> readAllTaxes() throws DaoPersistenceException {
        return new ArrayList<Tax>(taxes.values());
    }

    @Override
    public Tax readByState(String state) throws DaoPersistenceException {
        if (taxes.containsKey(state)) {
            return taxes.get(state);
        }
        return null;
    }

    public void loadTaxs() throws DaoPersistenceException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(TAXES_FILE)));
        } catch (FileNotFoundException e) {
            throw new DaoPersistenceException("*** Could not load tax data into memory ***", e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Tax currentTax = new Tax(currentTokens[0]);
            currentTax.setTaxRate(new BigDecimal(currentTokens[1]));

            taxes.put(currentTax.getState(), currentTax);
        }
        scanner.close();
    }

}
