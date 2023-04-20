package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description
 * @Date 10:06 AM 4/20/2023
 */
public class DayOfMonthExpression implements Expression {
    @Override
    public boolean interpret(String expression) {
        // 解析表达式，判断日期是否匹配
        return true; // 返回是否匹配
    }
}