package com.java.design.observer.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/26/2023
 */
public class User implements Observer {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println("User " + name + " received message: " + message);
    }
}
