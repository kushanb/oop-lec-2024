package com.iit.oop.week2;

public class Ticket {
    private static int numOfTicketsSold;
    private int ticketNo;
    private double price;

    /**
     * Constructor for the Ticket class
     *
     * @param ticketNo identifier of the ticket
     * @param price the price of the ticket
     */
    public Ticket(int ticketNo, double price) {
        super();
        this.ticketNo = ticketNo;
        this.price = price;
        numOfTicketsSold++;
    }

    public static int getNumOfTicketsSold() {
        return numOfTicketsSold;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNo=" + ticketNo +
                ", price=" + price +
                '}';
    }
}
