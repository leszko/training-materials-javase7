package com.luxoft.java7se.exercise8.domain;

public class SavingAccount implements Account {
    private double balance;

    public SavingAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double x) {
        this.balance += x;
    }

    @Override
    public void withdraw(double x) {
        if (this.balance >= x) {
            this.balance -= x;
        } else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public double maximumAmountToWithdraw() {
        return balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "balance=" + balance +
                '}';
    }
}
