package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:39 AM 4/19/2023
 */
public class CancelOrderCommand implements OrderCommand {
    private Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.cancel();
    }

    public void undo() {
        order.uncancel();
    }
}