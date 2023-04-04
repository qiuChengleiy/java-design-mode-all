package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 韵达
 * @Date 10:23 AM 4/4/2023
 */
public class YundaExpressService {
    public void createOrder(String orderId, String senderAddress, String receiverAddress) {
        System.out.println("Yunda Express created order for " + orderId + " from " + senderAddress + " to " + receiverAddress);
    }

    public void cancelOrder(String orderId) {
        System.out.println("Yunda Express cancelled order for " + orderId);
    }

    public void getOrderStatus(String orderId) {
        System.out.println("Yunda Express queried order status for " + orderId);
    }
}
