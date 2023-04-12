package com.java.design.facade.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/12/2023
 */
public class LogisticsService {

    public void ship(Order order) {
        System.out.println("SHIP >>>>> " + order.getOrderId());
    }
}
