package com.java.design.flyweight;

/**
 * @Author qcl
 * @Description 享元模式
 * @Date 9:49 AM 4/13/2023
 */
public class Client {
    private static final String[] colors = { "Red", "Green", "Blue" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
