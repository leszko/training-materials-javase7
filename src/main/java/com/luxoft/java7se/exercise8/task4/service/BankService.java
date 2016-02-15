package com.luxoft.java7se.exercise8.task4.service;

import com.luxoft.java7se.exercise8.task4.domain.Bank;
import com.luxoft.java7se.exercise8.task4.domain.Client;

public class BankService {
    public void addClient(Bank bank, Client client) {
        bank.addClient(client);
    }
}
