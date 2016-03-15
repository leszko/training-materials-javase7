package com.luxoft.java7se.exercise8;

import com.luxoft.java7se.exercise8.domain.*;
import com.luxoft.java7se.exercise8.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client client1 = new Client("Rafal", Gender.MALE);
        client1.setAccount(new CheckingAccount(10.0, 15.0));
        bank.add(client1);

        Client client2 = new Client("Justyna", Gender.FEMALE);
        client2.setAccount(new SavingAccount(10.0));
        bank.add(client2);

        BankService service = new BankService();
        service.transfer(client1.getAccount(), client2.getAccount(), 15.5);

        System.out.println(bank.toString());
    }
}
