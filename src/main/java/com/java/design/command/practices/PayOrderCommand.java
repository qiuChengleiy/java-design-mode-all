package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:39 AM 4/19/2023
 */
public class PayOrderCommand implements OrderCommand {
    private Order order;

    public PayOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.pay();
    }

    public void undo() {
        order.unpay();
    }
}
