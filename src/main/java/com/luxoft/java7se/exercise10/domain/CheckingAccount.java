package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.OverDraftLimitExceededException;

public class CheckingAccount implements Account {

    private double balance;
    private double overdraft;

    public CheckingAccount(double startingBalance, double overdraft) {
        if (startingBalance < 0 || overdraft < 0) {
            throw new IllegalArgumentException();
        }
        this.balance = startingBalance;
        this.overdraft = overdraft;
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
    public void withdraw(double x) throws OverDraftLimitExceededException {
        if (x > maximumAmountToWithdraw()) {
            throw new OverDraftLimitExceededException(this, maximumAmountToWithdraw(), x);
        }
        if (this.balance + this.overdraft >= x) {
            this.balance -= x;
        } else {
            System.out.println("Not enough money");
        }

        assert balance >= -overdraft;
    }

    @Override
    public double maximumAmountToWithdraw() {
        return balance + overdraft;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", overdraft=" + overdraft +
                "maximumAmountToWithdraw=" + maximumAmountToWithdraw() +
                '}';
    }
}
