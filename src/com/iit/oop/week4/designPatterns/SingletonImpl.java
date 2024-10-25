package com.iit.oop.week4.designPatterns;

public class SingletonImpl {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();

        object1.setName("Singleton Object");
        object1.setAge("2");

        System.out.println(object1);
    }
}
