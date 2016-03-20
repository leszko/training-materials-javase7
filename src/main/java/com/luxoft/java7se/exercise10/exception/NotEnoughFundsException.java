package com.luxoft.java7se.exercise10.exception;

import java.math.BigDecimal;

public class NotEnoughFundsException extends BankException {
    private double amount;

    public NotEnoughFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
