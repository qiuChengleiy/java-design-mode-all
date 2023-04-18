package com.java.design.responsibility;

/**
 * @Author qcl
 * @Description
 * @Date 9:41 AM 4/18/2023
 */
public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestInfo().contains("request1")) {
            request.setResponseInfo("response1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }
}
