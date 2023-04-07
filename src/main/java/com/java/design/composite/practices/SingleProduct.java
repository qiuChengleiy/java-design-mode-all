package com.java.design.composite.practices;

/**
 * @Author qcl
 * @Description
 * @Date 11:37 AM 4/7/2023
 */
public class SingleProduct implements Product {
    private String name;
    private double price;

    public SingleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
