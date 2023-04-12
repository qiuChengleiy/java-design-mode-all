package com.java.design.facade.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 4/12/2023
 */
public class FacadeDemo {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.createOrder(new Order("xx131423124312331", "1", 96.00));

//        开始验证订单信息...
//        订单验证通过！
//        开始处理订单支付...
//        SHIP >>>>> xx131423124312331
    }
}
