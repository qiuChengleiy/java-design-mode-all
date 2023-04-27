package com.java.design.state;

/**
 * @Author qcl
 * @Description
 * @Date 9:27 AM 4/27/2023
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
