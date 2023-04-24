package com.java.design.mediator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:33 AM 4/24/2023
 */
public class PurchaseOrder extends Order {

    public PurchaseOrder(Mediator mediator, String orderId) {
        super(mediator, orderId);
    }

    @Override
    public void place() {
        mediator.placeOrder(this);
    }

    @Override
    public void cancel() {
        mediator.cancelOrder(this);
    }
}
