package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description 分钟表达式
 * @Date 10:06 AM 4/20/2023
 */
public class MinuteExpression implements Expression {
    @Override
    public boolean interpret(String expression) {
        // 解析表达式，判断分钟数是否匹配
        return true; // 返回是否匹配
    }
}
