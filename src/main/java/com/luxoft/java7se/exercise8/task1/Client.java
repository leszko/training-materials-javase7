package com.luxoft.java7se.exercise8.task1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    List<Account> getAccounts() {
        return accounts;
    }
}
