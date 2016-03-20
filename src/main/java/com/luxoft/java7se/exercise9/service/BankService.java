package com.luxoft.java7se.exercise9.service;


import com.luxoft.java7se.exercise9.domain.Account;

public class BankService {
    public void transfer(Account accountFrom,
                         Account accountTo,
                         double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
