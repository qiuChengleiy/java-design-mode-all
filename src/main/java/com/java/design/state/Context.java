package com.java.design.state;

/**
 * @Author qcl
 * @Description
 * @Date 9:28 AM 4/27/2023
 */
public class Context {
    private State state;

    public Context() {
        state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
