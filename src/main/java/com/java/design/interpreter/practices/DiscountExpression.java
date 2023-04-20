package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description 抽象表达式
 * @Date 9:43 AM 4/20/2023
 */
public interface DiscountExpression {
    double interpret(ShoppingCart cart);
}
