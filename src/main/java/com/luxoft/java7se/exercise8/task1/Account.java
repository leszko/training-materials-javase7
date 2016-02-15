package com.luxoft.java7se.exercise8.task1;

import java.math.BigDecimal;

public interface Account {
    BigDecimal getBalance();

    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount);
}
