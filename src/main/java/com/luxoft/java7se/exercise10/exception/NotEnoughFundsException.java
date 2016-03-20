package com.luxoft.java7se.exercise10.exception;

import com.luxoft.java7se.exercise10.domain.Account;

public class NotEnoughFundsException extends BankException {
    private Account account;
    private double maxiumAmountToWithdraw;
    private double amount;

    public NotEnoughFundsException(Account account, double maxiumAmountToWithdraw, double amount) {
        this.account = account;
        this.maxiumAmountToWithdraw = maxiumAmountToWithdraw;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public double getMaxiumAmountToWithdraw() {
        return maxiumAmountToWithdraw;
    }

    public double getAmount() {
        return amount;
    }
}
