package com.iit.oop.week8.syncThread;

public class InternetBankingSystem {
    public static void main(String[] args) {
        Account account1 = new Account("John Doe", 100);
        new Thread(new DepositThread(account1, 30)).start();
        new Thread(new DepositThread(account1, 20)).start();
        new Thread(new DepositThread(account1, 10)).start();
        new Thread(new WithdrawThread(account1,30)).start();
        new Thread(new WithdrawThread(account1,50)).start();
        new Thread(new WithdrawThread(account1,20)).start();
    }
}
