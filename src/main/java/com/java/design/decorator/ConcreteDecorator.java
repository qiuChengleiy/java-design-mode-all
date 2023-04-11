package com.java.design.decorator;

/**
 * @Author qcl
 * @Description
 * @Date 9:42 AM 4/11/2023
 */
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("ConcreteDecorator.operation()");
    }
}
