package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description  秒表达式
 * @Date 10:05 AM 4/20/2023
 */
public class SecondExpression implements Expression {
    @Override
    public boolean interpret(String expression) {
        // 解析表达式，判断秒数是否匹配
        return true; // 返回是否匹配
    }
}
