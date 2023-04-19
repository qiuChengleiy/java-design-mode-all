package com.java.design.command;

/**
 * @Author qcl
 * @Description
 * @Date 9:37 AM 4/19/2023
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
