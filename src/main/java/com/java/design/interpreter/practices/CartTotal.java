package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description 终结符表达式：购物车总价
 * @Date 9:44 AM 4/20/2023
 */
public class CartTotal implements DiscountExpression {
    public double interpret(ShoppingCart cart) {
        double total = 0;
        for (CartItem item : cart.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
