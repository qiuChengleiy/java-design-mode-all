package com.java.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author qcl
 * @Description 享元工厂类
 * @Date 9:48 AM 4/13/2023
 */
class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    // 获取具体形状
    public static Shape getShape(String color) {
        Shape shape = shapes.get(color);

        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color, shape);
            System.out.println("Creating circle of color : " + color);
        }

        return shape;
    }
}
