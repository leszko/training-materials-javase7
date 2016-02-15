package com.luxoft.java7se.exercise10.exception;

import java.math.BigDecimal;

public class NotEnoughFundsException extends BankException {
    private BigDecimal amount;

    public NotEnoughFundsException(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
