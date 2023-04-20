package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description
 * @Date 10:06 AM 4/20/2023
 */
public class HourExpression implements Expression {
    @Override
    public boolean interpret(String expression) {
        // 解析表达式，判断小时数是否匹配
        return true; // 返回是否匹配
    }
}
