package com.iit.oop.week3;

public class Person {
    private String name;
    private String dob;

    /**
     * Default constructor
     */
    public Person() {
        super();
        this.name = "John Doe";
        this.dob = "1st April";
    }

    /**
     * Constructor for initialising the object
     *
     * @param name name of the person
     * @param dob date of birth of the person
     */
    public Person(String name, String dob) {
        super();
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    /**
     * Walk method
     */
    public void walk() {
        System.out.println(this.name + " is walking...");
    }

    /**
     * Talk method
     */
    public void talk() {
        System.out.println(this.name + "is talking...");
    }
}
