package com.luxoft.java7se.exercise10.exception;

import com.luxoft.java7se.exercise10.domain.Account;

public class OverDraftLimitExceededException extends NotEnoughFundsException {
    public OverDraftLimitExceededException(Account account, double maxiumAmountToWithdraw, double amount) {
        super(account, maxiumAmountToWithdraw, amount);
    }
}
