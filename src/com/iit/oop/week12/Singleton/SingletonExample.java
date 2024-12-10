package com.iit.oop.week12.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
        connection.setHost("localhost");
        connection.setPort(8000);

        System.out.println(connection.getHost());
        System.out.println(connection.getPort());
    }
}
