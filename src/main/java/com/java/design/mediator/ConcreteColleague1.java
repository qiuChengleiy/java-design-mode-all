package com.java.design.mediator;

/**
 * @Author qcl
 * @Description
 * @Date 10:23 AM 4/24/2023
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleague1 接收到消息：" + message);
    }
}
