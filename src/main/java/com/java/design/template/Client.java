package com.java.design.template;

/**
 * @Author qcl
 * @Description 模板方法模式
 * @Date 9:17 AM 5/5/2023
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass object1 = new ConcreteClass1();
        object1.templateMethod();
        AbstractClass object2 = new ConcreteClass2();
        object2.templateMethod();
    }
}
