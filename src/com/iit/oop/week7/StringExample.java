package com.iit.oop.week7;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String a = "Hello World";
        String ab = "   Hello World   ";
        String b = "Hello World";

        String c  = new String("Hello World");

//        System.out.println("a == b : " + (a == b));
//        System.out.println("a == c : " + (a == c));
//        System.out.println("b == c : " + (b == c));
//        System.out.println("Compare strings: " + ("A" == "A"));
//        System.out.println("Compare a == c content: " + a.equals(c));

//        System.out.println(a.substring(1, 7));
//        System.out.println(a.concat("!"));
//        System.out.println(a);
//        System.out.println(a.replace("l", "3"));
//        String[] splitString = a.split("l");
//        System.out.println(Arrays.toString(splitString));
//        System.out.println(ab.trim());
//        System.out.println(ab.trim().toLowerCase());
//        System.out.println(ab.trim().toUpperCase());
//        System.out.println(a.indexOf("l"));
//        System.out.println(a.lastIndexOf("l"));

        Scanner sc = new Scanner(System.in);
//        String concatString = "";
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a letter: ");
            String s = sc.nextLine();
            builder.append(s);
            System.out.println(builder);
        }
        System.out.println("Final String: " + builder.toString());





    }
}
