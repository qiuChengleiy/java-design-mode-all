package com.java.design.builder.busi;

import java.math.BigDecimal;

/**
 * @Author qcl
 * @Description
 * @Date 10:04 AM 3/31/2023
 */
public class ProductDirector {
    private ProductBuilder builder;

    public ProductDirector(ProductBuilder builder) {
        this.builder = builder;
    }

    public Product constructProduct(String name, String description, BigDecimal price, int stock, String brand, String category) {
        builder.setName(name);
        builder.setDescription(description);
        builder.setPrice(price);
        builder.setStock(stock);
        builder.setBrand(brand);
        builder.setCategory(category);
        return builder.build();
    }
}

