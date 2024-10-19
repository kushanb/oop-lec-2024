package com.iit.oop.week4;

public class MyShapeImpl implements ShapeImpl {

    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        Shape rectangle = new Rectangle(5, 6);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

    }

    @Override
    public void printShapes() {
        System.out.println("/\\ ()");
    }
}
