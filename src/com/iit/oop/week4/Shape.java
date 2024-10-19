package com.iit.oop.week4;

public abstract class Shape {

    // Constant
    public static final String TAG = "Shape";

    private String color;

    /**
     * Draws the shape that has been created
     */
    public abstract void draw();

//    /**
//     * Get area method suited for rectangles
//     *
//     * @param height
//     * @param width
//     * @return
//     */
//    public abstract double getArea(double height, double width);

    /**
     * Get area method
     *
     *
     * @return
     */
    public abstract double getArea();

    /**
     * Just a random method
     */
    public void printSomething() {
        System.out.println("Something...");
    }

    public String getColor() {
        return color;
    }
}
