package com.java.design.decorator;

/**
 * @Author qcl
 * @Description 装饰器模式
 * @Date 9:42 AM 4/11/2023
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
