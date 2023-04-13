package com.java.design.flyweight.practices;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author qcl
 * @Description
 * @Date 9:52 AM 4/13/2023
 */
public class ProductFactory {
    private static final Map<String, Product> products = new HashMap<>();

    public static Product getProduct(String name, double price, String description, String image) {
        String key = name + price + description + image;

        if (products.containsKey(key)) {
            return products.get(key);
        } else {
            Product product = new ConcreteProduct(name, price, description, image);
            products.put(key, product);
            return product;
        }
    }
}
