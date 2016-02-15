package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class SavingAccount implements Account {
    private BigDecimal balance;

    public SavingAccount(BigDecimal initialBalance) {
        if (initialBalance.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
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
    public void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            throw new NotEnoughFundsException(maximumAmountToWithdraw());
        }

    }

    @Override
    public BigDecimal maximumAmountToWithdraw() {
        return balance;
    }
}
