package com.luxoft.java7se.exercise8.task3.service;

import com.luxoft.java7se.exercise8.task3.domain.Bank;
import com.luxoft.java7se.exercise8.task3.domain.Client;

public class BankService {
    public void addClient(Bank bank, Client client) {
        bank.addClient(client);
    }
}
