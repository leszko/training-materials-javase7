package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public interface Account {
    BigDecimal getBalance();

    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount) throws NotEnoughFundsException;

    BigDecimal maximumAmountToWithdraw();
}
