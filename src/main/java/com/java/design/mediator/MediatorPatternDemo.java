package com.java.design.mediator;

/**
 * @Author qcl
 * @Description 中介者模式
 * @Date 10:23 AM 4/24/2023
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("Hello, colleague2!");
        colleague2.sendMessage("Hello, colleague1!");

//        ConcreteColleague2 接收到消息：Hello, colleague2!
//                ConcreteColleague1 接收到消息：Hello, colleague1!
    }
}
