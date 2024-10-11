package com.iit.oop.week1;

public class IITBank {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount(200.00, "123456");
        System.out.println("Accounts: " + BankAccount.getNumberOfAccounts());
        BankAccount account2 = new BankAccount(400.00, "456876");
        System.out.println("Accounts: " + BankAccount.getNumberOfAccounts());
        BankAccount account3 = new BankAccount(600.00, "3456867");
        System.out.println("Accounts: " + BankAccount.getNumberOfAccounts());

        // Invoking deposit method
        account1.deposit(400);
        account2.deposit(900);

        // Printing out the objects after depositing
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " +account2);
        System.out.println("Account 3: " +account3);

        // Example for object reference
        System.out.println("Creating account 4");
        BankAccount account4 = account2;
        System.out.println("Account 4: " + account4);
        System.out.println("Depositing money");
        account4.deposit(1000);
        System.out.println("Account 4: " + account4);
        System.out.println("Account 2: " + account2);
        account1 = null;
        System.out.println(account1);

        BankAccount account5;

        addCash(account3);
        System.out.println("Account 3 after cash: " +account3);

    }


    public static void addCash(BankAccount account) {
        account.deposit(2000);
        System.out.println("Cash Added: " + account);
    }
}
