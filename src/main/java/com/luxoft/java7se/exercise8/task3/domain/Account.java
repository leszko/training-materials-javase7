package com.luxoft.java7se.exercise8.task3.domain;

import java.math.BigDecimal;

public interface Account {
    BigDecimal getBalance();

    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount);
}
