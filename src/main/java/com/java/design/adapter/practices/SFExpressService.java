package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 顺丰
 * @Date 10:22 AM 4/4/2023
 */
public class SFExpressService {
    public void createShipment(String orderId, String senderAddress, String receiverAddress) {
        System.out.println("SF Express created shipment for order " + orderId + " from " + senderAddress + " to " + receiverAddress);
    }

    public void cancelShipment(String orderId) {
        System.out.println("SF Express cancelled shipment for order " + orderId);
    }

    public void queryShipment(String orderId) {
        System.out.println("SF Express queried shipment for order " + orderId);
    }
}
