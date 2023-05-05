package com.java.design.template.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:21 AM 5/5/2023
 */
public class Client {
    public static void main(String[] args) {
        Order onlineOrder = new OnlineOrder();
        onlineOrder.processOrder();
        Order offlineOrder = new OfflineOrder();
        offlineOrder.processOrder();
    }
}
