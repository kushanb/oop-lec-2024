package com.iit.oop.week12.Factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else {
            System.out.println("Not a real shape...");
            return null;
        }
    }
}
