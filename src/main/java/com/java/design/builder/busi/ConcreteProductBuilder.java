package com.java.design.builder.busi;

import java.math.BigDecimal;

/**
 * @Author qcl
 * @Description
 * @Date 10:03 AM 3/31/2023
 */
public class ConcreteProductBuilder implements ProductBuilder {
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private String brand;
    private String category;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public Product build() {
        return new Product(name, description, price, stock, brand, category);
    }
}

