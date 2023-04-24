package com.java.design.mediator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:33 AM 4/24/2023
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new OrderMediator();
        Order order = new PurchaseOrder(mediator, "PO12345");

        order.place();
        order.cancel();
//        New order placed: PO12345
//        Cancelled order: PO12345
    }
}
