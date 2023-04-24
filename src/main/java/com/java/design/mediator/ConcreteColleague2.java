package com.java.design.mediator;

/**
 * @Author qcl
 * @Description
 * @Date 10:23 AM 4/24/2023
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleague2 接收到消息：" + message);
    }
}
