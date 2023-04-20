package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description 终结符表达式：折扣价
 * @Date 9:50 AM 4/20/2023
 */
public class DiscountPrice implements  DiscountExpression {
    private double discount;

    public DiscountPrice(double discount) {
        this.discount = discount;
    }

    @Override
    public double interpret(ShoppingCart cart) {
        double price = 0;
        for (CartItem item : cart.getItems()) {
            price += item.getPrice() * item.getQuantity() * discount;
        }
        return price;
    }
}
