package com.luxoft.java7se.exercise10.service;


import com.luxoft.java7se.exercise10.domain.Account;

public class BankService {
    public void transfer(Account accountFrom,
                         Account accountTo,
                         double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
