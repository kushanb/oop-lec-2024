package com.iit.oop.week1;

public class BankAccount {
    private double balance;
    private String accountNumber;

    private static int numberOfAccounts;

    /**
     * Default constructor
     */
    public BankAccount() {
        super();
    }

    /**
     * Constructor for the BankAccount class
     *
     * @param balance account balance
     * @param accountNumber unique identifier for the account
     */
    public BankAccount(double balance, String accountNumber) {
        super();
        this.balance = balance;
        this.accountNumber = accountNumber;
        numberOfAccounts++;
    }

    /**
     * Reduces the account balance when cash is withdrawn
     *
     * @param amount amount to be withdrawn
     */
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    /**
     * Add the amount entered to the account balance
     *
     * @param amount amount to be deposited
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Returns the balance
     *
     * @return the balance
     */
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
