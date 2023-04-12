package com.java.design.facade;

/**
 * @Author qcl
 * @Description 外观模式
 * @Date 9:22 AM 4/12/2023
 */
public class FacadeDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.order();
    }
}
