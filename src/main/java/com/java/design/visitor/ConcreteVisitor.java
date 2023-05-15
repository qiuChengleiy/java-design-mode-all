package com.java.design.visitor;

/**
 * @Author qcl
 * @Description
 * @Date 9:28 AM 5/15/2023
 */
public class ConcreteVisitor implements Visitor {
    public void visit(Element element) {
        System.out.println("Visiting " + element.operation());
    }
}
