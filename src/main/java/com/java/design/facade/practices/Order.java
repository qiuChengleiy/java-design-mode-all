package com.java.design.facade.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:44 AM 4/12/2023
 */
public class Order {
    private String orderId;
    private String userId;
    private double amount;

    public Order(String orderId, String userId, double amount) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }
}