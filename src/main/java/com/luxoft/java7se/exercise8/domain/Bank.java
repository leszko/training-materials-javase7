package com.luxoft.java7se.exercise8.domain;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Client> clients = new ArrayList<>();

    public void add(Client client) {
        this.clients.add(client);
    }

    @Override
    public String toString() {
        return "com.luxoft.java7se.exercise8.domain.Bank{" +
                "clients=" + clients +
                '}';
    }
}
