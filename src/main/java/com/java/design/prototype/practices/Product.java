package com.java.design.prototype.practices;

import lombok.Data;

/**
 * @Author qcl
 * @Description
 * @Date 11:02 AM 4/3/2023
 */
@Data
public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
