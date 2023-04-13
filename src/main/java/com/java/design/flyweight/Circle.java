package com.java.design.flyweight;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 4/13/2023
 */
class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of color : " + color);
    }
}
