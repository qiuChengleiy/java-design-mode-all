package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description 抽象表达式
 * @Date 9:31 AM 4/20/2023
 */
public interface Expression {
    boolean interpret(String expression);
}
