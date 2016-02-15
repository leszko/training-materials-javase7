package com.luxoft.java7se.exercise8.task2;

import java.math.BigDecimal;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client rafal = new Client("rafal", Gender.MALE);
        rafal.addAccount(new CheckingAccount(new BigDecimal(10.4)));
        bank.addClient(rafal);

        Client andy = new Client("andy", Gender.MALE);
        andy.addAccount(new CheckingAccount(new BigDecimal(15)));
        bank.addClient(andy);

        Client maria = new Client("maria", Gender.FEMALE);
        maria.addAccount(new CheckingAccount(new BigDecimal(20)));
        bank.addClient(maria);

        printBalance(bank);
        transfer(rafal.getAccounts().get(0), andy.getAccounts().get(0), new BigDecimal(5.2));
        printBalance(bank);
    }

    private static void printBalance(Bank bank) {
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccounts()) {
                System.out.println("Client: " + client.toString() + " balance: " + account.getBalance());
            }
        }
    }

    private static void transfer(Account from, Account to, BigDecimal amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
