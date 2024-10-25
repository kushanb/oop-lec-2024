package com.iit.oop.week4.designPatterns;

public class Singleton {
    private static Singleton instance;
    private String name;
    private String age;

    private Singleton() {
        super();
    }

    /**
     * Get instance method for the Singleton class
     *
     * @return singleton object
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
