package com.java.design.strategy;

/**
 * @Author qcl
 * @Description 策略模式
 * @Date 9:48 AM 5/4/2023
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
    }
}
