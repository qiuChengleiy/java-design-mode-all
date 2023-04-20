package com.java.design.interpreter;

/**
 * @Author qcl
 * @Description 解释器模式
 * @Date 10:07 AM 4/20/2023
 */
public class Client {
    public static void main(String[] args) {
        // 创建表达式对象
        Expression second = new SecondExpression();
        Expression minute = new MinuteExpression();
        Expression hour = new HourExpression();
        Expression dayOfMonth = new DayOfMonthExpression();
        Expression cron = new CronExpression(second, minute, hour, dayOfMonth);

        // 判断定时任务是否应该被执行
        String expression = "0 0 1 * *"; // 每月1日执行任务
        boolean match = cron.interpret(expression);

        if (match) {
            System.out.println("定时任务执行中...");
        } else {
            System.out.println("定时任务未开始...");
        }
    }
}

