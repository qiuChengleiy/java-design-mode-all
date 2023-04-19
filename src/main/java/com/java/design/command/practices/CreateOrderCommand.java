package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description 定义具体的命令类，比如创建订单、取消订单、支付订单等
 * @Date 9:38 AM 4/19/2023
 */
public class CreateOrderCommand implements OrderCommand {
    private Order order;

    public CreateOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.create();
    }

    public void undo() {
        order.cancelCreate();
    }
}
