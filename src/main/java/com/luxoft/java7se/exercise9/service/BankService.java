package com.luxoft.java7se.exercise9.service;

import com.luxoft.java7se.exercise9.domain.Bank;
import com.luxoft.java7se.exercise9.domain.Client;

public class BankService {
    public void addClient(Bank bank, Client client) {
        bank.addClient(client);
    }
}
