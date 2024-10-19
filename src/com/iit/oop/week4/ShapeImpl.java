package com.iit.oop.week4;

public interface ShapeImpl {

    /**
     * Prints multiple shapes of the object
     */
    void printShapes();

    default void printAnotherThing() {
        System.out.println("Another thing...");
    }


}
