package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description 定时任务表达式
 * @Date 10:07 AM 4/20/2023
 */
public class CronExpression implements Expression {
    private Expression secondExpression;
    private Expression minuteExpression;
    private Expression hourExpression;
    private Expression dayOfMonthExpression;

    public CronExpression(Expression secondExpression, Expression minuteExpression,
                          Expression hourExpression, Expression dayOfMonthExpression) {
        this.secondExpression = secondExpression;
        this.minuteExpression = minuteExpression;
        this.hourExpression = hourExpression;
        this.dayOfMonthExpression = dayOfMonthExpression;
    }

    @Override
    public boolean interpret(String expression) {
        String[] fields = expression.split(" ");

        // 解析定时任务表达式，判断各个字段是否匹配
        boolean matchSecond = secondExpression.interpret(fields[0]);
        boolean matchMinute = minuteExpression.interpret(fields[1]);
        boolean matchHour = hourExpression.interpret(fields[2]);
        boolean matchDayOfMonth = dayOfMonthExpression.interpret(fields[3]);

        return matchSecond && matchMinute && matchHour && matchDayOfMonth;
    }
}
