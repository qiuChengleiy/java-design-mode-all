package com.java.design.facade.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:44 AM 4/12/2023
 */
public class OrderValidator {
    public boolean validate(Order order) {
        System.out.println("开始验证订单信息...");
        // 假设验证通过
        System.out.println("订单验证通过！");
        return true;
    }
}