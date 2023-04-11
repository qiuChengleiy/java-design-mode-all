package com.java.design.decorator;

/**
 * @Author qcl
 * @Description
 * @Date 9:42 AM 4/11/2023
 */
class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}