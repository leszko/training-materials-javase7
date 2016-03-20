package com.luxoft.java7se.exercise10.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;
    private final Gender gender;
    private List<Account> accounts = new ArrayList<>();

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getClientSalutation() {
        return gender.getSalutation() + " " + name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                getClientSalutation() +
                ", accounts=" + accounts +
                '}';
    }
}
