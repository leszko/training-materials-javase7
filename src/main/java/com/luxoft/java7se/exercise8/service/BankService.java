package com.luxoft.java7se.exercise8.service;

import com.luxoft.java7se.exercise8.domain.Account;

public class BankService {
    public void transfer(Account accountFrom,
                         Account accountTo,
                         double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
