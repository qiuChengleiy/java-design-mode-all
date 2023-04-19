package com.java.design.command;

/**
 * @Author qcl
 * @Description 命令模式
 * @Date 9:38 AM 4/19/2023
 */
public class Client {
    public static void main(String[] args) {
        // 创建接收者对象
        Light light = new Light();

        // 创建具体命令对象并设置其接收者
        Command lightOnCommand = new LightOnCommand(light);

        // 创建调用者对象并设置其命令
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);

        // 调用者发出请求，命令对象执行具体操作
        remoteControl.pressButton();
    }
}
