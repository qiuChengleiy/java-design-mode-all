package com.java.design.mediator;

/**
 * @Author qcl
 * @Description 中介者模式
 * @Date 10:22 AM 4/24/2023
 */
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

