package com.java.design.responsibility;

/**
 * @Author qcl
 * @Description 责任链模式
 * @Date 9:41 AM 4/18/2023
 */
public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler nextHandler);
    Handler getNextHandler();
}
