package com.iit.oop.week2;

public class IITTicketDesk {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, 2000);
        System.out.println(ticket1);
        System.out.println(Ticket.getNumOfTicketsSold());

        Ticket ticket2 = new Ticket(2, 2500);
        System.out.println(ticket2);
        System.out.println(Ticket.getNumOfTicketsSold());

        String s1 = "Hello World";
        String s2 = new String("Hello World"); // Long method of defining a string
        System.out.println(s2 + " " + s2.length());

        System.out.println("Pi: " + Math.PI); // Example use of a constant
    }
}
