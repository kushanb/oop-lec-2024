package com.iit.oop.week4;

public class Circle extends Shape implements ShapeImpl {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("()");
    }

//    @Override
//    public double getArea(double height, double width) {
//        return 0;
//    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printShapes() {

    }

    @Override
    public void printAnotherThing() {
        ShapeImpl.super.printAnotherThing();
    }
}
