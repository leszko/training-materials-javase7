package com.luxoft.java7se.exercise10.exception;

import java.math.BigDecimal;

public class OverDraftLimitExceededException extends NotEnoughFundsException {
    public OverDraftLimitExceededException(double amount) {
        super(amount);
    }
}
