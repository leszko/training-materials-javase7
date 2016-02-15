package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;
import com.luxoft.java7se.exercise10.exception.OverDraftLimitExceededException;

import java.math.BigDecimal;

public class CheckingAccount implements Account {

    private BigDecimal balance;

    private BigDecimal initialOverdraft;
    private BigDecimal overdraft;

    public CheckingAccount(BigDecimal initialBalance, BigDecimal initialOverdraft) {
        if (initialBalance.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        if (initialOverdraft.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Overdraft cannot be negative");
        }
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
    public void withdraw(BigDecimal amount) throws OverDraftLimitExceededException {
        if (balance.add(overdraft).compareTo(amount) >= 0) {
            if (balance.compareTo(amount) >= 0) {
                balance = balance.subtract(amount);
            } else {
                overdraft = amount.subtract(balance);
                balance = new BigDecimal(0);
            }
        } else {
            throw new OverDraftLimitExceededException(maximumAmountToWithdraw());
        }
        assert overdraft.compareTo(new BigDecimal(0)) >= 0;
        assert balance.compareTo(new BigDecimal(0)) >= 0;
    }

    @Override
    public BigDecimal maximumAmountToWithdraw() {
        return balance.add(overdraft);
    }
}
