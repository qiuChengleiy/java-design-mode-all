package com.java.design.command;

/**
 * @Author qcl
 * @Description
 * @Date 9:38 AM 4/19/2023
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
