package com.java.design.composite.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 11:38 AM 4/7/2023
 */
public class CompositeProduct implements Product {
    private String name;
    private List<Product> products = new ArrayList<>();

    public CompositeProduct(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

