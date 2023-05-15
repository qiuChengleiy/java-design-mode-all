package com.java.design.visitor;

/**
 * @Author qcl
 * @Description 访问者模式
 * @Date 9:28 AM 5/15/2023
 */
public class Client {
    public static void main(String[] args) {
        Element element = new ConcreteElement();
        Visitor visitor = new ConcreteVisitor();
        element.accept(visitor);
        // Visiting ConcreteElement
    }
}
