package com.java.design.composite;

/**
 * @Author qcl
 * @Description
 * @Date 10:09 AM 4/7/2023
 */
class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }
}
