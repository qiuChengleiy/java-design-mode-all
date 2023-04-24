package com.java.design.mediator;

/**
 * @Author qcl
 * @Description
 * @Date 10:22 AM 4/24/2023
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receiveMessage(String message);
}
