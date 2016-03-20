package com.luxoft.java7se.exercise10.domain;

import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;

public interface Account {
    double getBalance();

    void deposit(double x);

    void withdraw(double x) throws NotEnoughFundsException;

    double maximumAmountToWithdraw();
}
