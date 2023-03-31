package com.java.design.builder.busi;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author qcl
 * @Description
 * @Date 10:02 AM 3/31/2023
 */
@Data
public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private String brand;
    private String category;

    public Product(String name, String description, BigDecimal price, int stock, String brand, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
    }
}

