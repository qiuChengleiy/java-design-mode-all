package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description 非终结符表达式：满减
 * @Date 9:44 AM 4/20/2023
 */
public class Discount implements DiscountExpression {
    private DiscountExpression condition;
    private DiscountExpression action;

    public Discount(DiscountExpression condition, DiscountExpression action) {
        this.condition = condition;
        this.action = action;
    }

    public double interpret(ShoppingCart cart) {
        if (condition.interpret(cart) > 0) {
            return action.interpret(cart);
        }
        return 0;
    }
}