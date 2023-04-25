package com.java.design.memento;

/**
 * @Author qcl
 * @Description 备忘录模式
 * @Date 9:27 AM 4/25/2023
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
