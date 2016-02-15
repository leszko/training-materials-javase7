package com.luxoft.java7se.exercise8.task4.domain;

import java.math.BigDecimal;

public class CheckingAccount implements Account {

    private BigDecimal balance;

    private BigDecimal initialOverdraft;
    private BigDecimal overdraft;

    public CheckingAccount(BigDecimal initialBalance, BigDecimal initialOverdraft) {
        this.balance = initialBalance;
        this.initialOverdraft = initialOverdraft;
        this.overdraft = initialOverdraft;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void deposit(BigDecimal amount) {
        overdraft = overdraft.add(amount);
        if (overdraft.compareTo(initialOverdraft) >= 0) {
            BigDecimal toAmount = overdraft.subtract(initialOverdraft);
            balance = balance.add(amount);
            overdraft = new BigDecimal(initialOverdraft.doubleValue());

        }
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.add(overdraft).compareTo(amount) >= 0) {
            if (balance.compareTo(amount) >= 0) {
                balance = balance.subtract(amount);
            } else {
                overdraft = amount.subtract(balance);
                balance = new BigDecimal(0);
            }
        }
    }

    @Override
    public BigDecimal maximumAmountToWithdraw() {
        return balance.add(overdraft);
    }
}
