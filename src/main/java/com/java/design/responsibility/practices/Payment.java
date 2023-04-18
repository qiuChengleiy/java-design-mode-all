package com.java.design.responsibility.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/18/2023
 */
public class Payment {
    private Order order;
    private User user;
    private PaymentMethod paymentMethod;

    public Payment(Order order, User user, PaymentMethod paymentMethod) {
        this.order = order;
        this.user = user;
        this.paymentMethod = paymentMethod;
    }

    public Order getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
