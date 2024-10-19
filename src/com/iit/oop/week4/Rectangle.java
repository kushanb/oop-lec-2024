package com.iit.oop.week4;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public void draw() {
        System.out.println("|_|");
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

//    @Override
//    public double getArea(double radius) {
//        return 0;
//    }
}
