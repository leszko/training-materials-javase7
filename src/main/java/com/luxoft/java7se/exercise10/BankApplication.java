package com.luxoft.java7se.exercise10;

import com.luxoft.java7se.exercise10.domain.Bank;
import com.luxoft.java7se.exercise10.domain.Client;
import com.luxoft.java7se.exercise10.domain.Gender;
import com.luxoft.java7se.exercise10.domain.SavingAccount;
import com.luxoft.java7se.exercise10.event.ClientRegistrationListener;
import com.luxoft.java7se.exercise10.event.EmailNotificationListener;
import com.luxoft.java7se.exercise10.event.PrintClientListener;
import com.luxoft.java7se.exercise10.service.BankService;

import java.util.Date;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankService bankService = new BankService();

        bank.addListener(new PrintClientListener());
        bank.addListener(new EmailNotificationListener());
        bank.addListener(new ClientRegistrationListener() {
            @Override
            public void onClientAdded(Client client) {
                System.out.println(new Date());
            }
        });

        Client rafal = new Client("rafal", Gender.MALE);
        rafal.addAccount(new SavingAccount(10.4));
        bankService.addClient(bank, rafal);
    }
}
