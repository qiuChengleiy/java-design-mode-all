package com.java.design.decorator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/11/2023
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
