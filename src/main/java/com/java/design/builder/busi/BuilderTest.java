package com.java.design.builder.busi;

import java.math.BigDecimal;

/**
 * @Author qcl
 * @Description
 * @Date 10:06 AM 3/31/2023
 */
public class BuilderTest {
    public static void main(String[] args) throws Exception {
        ProductBuilder builder = new ConcreteProductBuilder();
        ProductDirector director = new ProductDirector(builder);
        Product product = director.constructProduct("iPhone 13", "Apple手机", new BigDecimal("7999.00"), 100, "Apple", "手机");
        System.out.println(product);
        // Product(name=iPhone 13, description=Apple手机, price=7999.00, stock=100, brand=Apple, category=手机)
    }
}
