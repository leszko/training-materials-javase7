package com.luxoft.java7se.exercise10.domain;

public interface Account {
    double getBalance();

    void deposit(double x);

    void withdraw(double x);

    double maximumAmountToWithdraw();
}
