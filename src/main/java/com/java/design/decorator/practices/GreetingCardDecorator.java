package com.java.design.decorator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/11/2023
 */
public class GreetingCardDecorator extends ProductDecorator {
    private static final double GREETING_CARD_PRICE = 3.0;
    private String message;

    public GreetingCardDecorator(Product product, String message) {
        super(product);
        this.message = message;
    }

    @Override
    public String getName() {
        return super.getName() + " (with greeting card)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + GREETING_CARD_PRICE;
    }

    public String getMessage() {
        return message;
    }
}
