package com.iit.oop.week8.syncThread;

public class WithdrawThread implements  Runnable {
    private Account account;
    private  double amount;

    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
