/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {

    private Map<String, Product> products = new HashMap<>();
    public static final String PRODUCTS_FILE = "Products.txt",
            DELIMITER = ",";

    public ProductDaoImpl() throws DaoPersistenceException {
        loadProducts();
    }

    @Override
    public List<Product> readAllProducts() throws DaoPersistenceException {
        return new ArrayList<Product>(products.values());
    }

    @Override
    public Product readByType(String productType) {
        if (products.containsKey(productType)) {
            return products.get(productType);
        }
        return null;
    }

    public void loadProducts() throws DaoPersistenceException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(PRODUCTS_FILE)));
        } catch (FileNotFoundException e) {
            throw new DaoPersistenceException("*** Could not load product data into memory ***", e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Product currentProduct = new Product(currentTokens[0]);
            currentProduct.setCostPerSquareFoot(new BigDecimal(currentTokens[1]));
            currentProduct.setLaborCostPerSquareFoot(new BigDecimal(currentTokens[2]));

            products.put(currentProduct.getProductType(), currentProduct);
        }
        scanner.close();
    }

}
