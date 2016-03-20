package com.luxoft.java7se.exercise10.service;

import com.luxoft.java7se.exercise10.domain.Bank;
import com.luxoft.java7se.exercise10.domain.Client;

public class BankService {
    public void addClient(Bank bank, Client client) {
        bank.addClient(client);
    }
}
