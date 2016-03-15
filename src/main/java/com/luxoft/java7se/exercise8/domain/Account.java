package com.luxoft.java7se.exercise8.domain;

public interface Account {
    double getBalance();

    void deposit(double x);

    void withdraw(double x);

    double maximumAmountToWithdraw();
}
