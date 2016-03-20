package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;

public class SavingAccount implements Account {
    private double balance;

    public SavingAccount(double startingBalance) {
        if (startingBalance < 0) {
            throw new IllegalArgumentException();
        }
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
    public void withdraw(double x) throws NotEnoughFundsException {
        if (x > maximumAmountToWithdraw()) {
            throw new NotEnoughFundsException(this, maximumAmountToWithdraw(), x);
        }
        if (this.balance >= x) {
            this.balance -= x;
        } else {
            System.out.println("Not enough money");
        }

        assert this.balance >= 0;
    }

    @Override
    public double maximumAmountToWithdraw() {
        return balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "balance=" + balance +
                ",maximumAmountToWithdraw=" + maximumAmountToWithdraw() +
                '}';
    }
}
