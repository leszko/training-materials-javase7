package com.luxoft.java7se.exercise10.service;


import com.luxoft.java7se.exercise10.domain.Account;
import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;

public class BankService {
    public void transfer(Account accountFrom,
                         Account accountTo,
                         double amount) throws NotEnoughFundsException {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
