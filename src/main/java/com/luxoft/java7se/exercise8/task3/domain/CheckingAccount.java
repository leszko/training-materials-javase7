package com.luxoft.java7se.exercise8.task3.domain;

import com.luxoft.java7se.exercise8.task3.domain.Account;

import java.math.BigDecimal;

public class CheckingAccount implements Account {

    private BigDecimal balance;

    public CheckingAccount(BigDecimal initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        }

    }
}
