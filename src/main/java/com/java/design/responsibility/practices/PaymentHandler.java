package com.java.design.responsibility.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:45 AM 4/18/2023
 */
public abstract class PaymentHandler {
    protected PaymentHandler successor;

    public void setSuccessor(PaymentHandler successor) {
        this.successor = successor;
    }

    public abstract void handle(Payment payment);
}
