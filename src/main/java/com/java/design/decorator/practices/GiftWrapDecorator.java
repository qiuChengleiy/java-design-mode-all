package com.java.design.decorator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/11/2023
 */
public class GiftWrapDecorator extends ProductDecorator {
    private static final double GIFT_WRAP_PRICE = 5.0;

    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() {
        return super.getName() + " (gift wrap)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + GIFT_WRAP_PRICE;
    }
}
