package com.java.design.observer;

/**
 * @Author qcl
 * @Description
 * @Date 9:40 AM 4/26/2023
 */
public class CounterObserver implements Observer {
    private int value;

    public void update(int value) {
        this.value = value;
        System.out.println("CounterObserver: Value changed to " + value);
    }
}
