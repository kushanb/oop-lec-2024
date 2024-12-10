package com.iit.oop.week12.Factory;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        Shape rectangle = factory.getShape("RECTANGLE");
        Shape triangle = factory.getShape("TRIANGLE");
        Shape none = factory.getShape("None");

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
