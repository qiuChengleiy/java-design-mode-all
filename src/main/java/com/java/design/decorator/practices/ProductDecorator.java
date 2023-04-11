package com.java.design.decorator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/11/2023
 */
public class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
