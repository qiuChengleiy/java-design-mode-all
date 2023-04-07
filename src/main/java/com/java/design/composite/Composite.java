package com.java.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:10 AM 4/7/2023
 */
class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public void show() {
        System.out.println(name);
        for (Component component : children) {
            component.show();
        }
    }
}
