package com.java.design.responsibility;

/**
 * @Author qcl
 * @Description
 * @Date 9:42 AM 4/18/2023
 */
public class HandlerChain {
    private Handler firstHandler;

    public void addHandler(Handler handler) {
        if (firstHandler == null) {
            firstHandler = handler;
            return;
        }
        Handler temp = firstHandler;
        while (temp != null) {
            if (temp.getNextHandler() == null) {
                temp.setNextHandler(handler);
                break;
            }
            temp = temp.getNextHandler();
        }
    }

    public void handleRequest(Request request) {
        if (firstHandler != null) {
            firstHandler.handleRequest(request);
        }
    }
}
