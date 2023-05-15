package com.java.design.visitor;

/**
 * @Author qcl
 * @Description
 * @Date 9:28 AM 5/15/2023
 */
class ConcreteElement implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "ConcreteElement";
    }
}
