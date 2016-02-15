package com.luxoft.java7se.exercise8.task4;

import com.luxoft.java7se.exercise8.task4.domain.*;
import com.luxoft.java7se.exercise8.task4.service.BankService;

import java.math.BigDecimal;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankService bankService = new BankService();

        Client rafal = new Client("rafal", Gender.MALE);
        rafal.addAccount(new SavingAccount(new BigDecimal(10.4)));
        bankService.addClient(bank, rafal);

        Client andy = new Client("andy", Gender.MALE);
        andy.addAccount(new SavingAccount(new BigDecimal(15)));
        bankService.addClient(bank, andy);

        Client maria = new Client("maria", Gender.FEMALE);
        maria.addAccount(new CheckingAccount(new BigDecimal(20), new BigDecimal(12.5)));
        bankService.addClient(bank, maria);

        printMaximumAmountToWithdraw(bank);
    }

    private static void printMaximumAmountToWithdraw(Bank bank) {
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccounts()) {
                System.out.println("Client: " + client.toString() + " maximum to withdraw: " + account.maximumAmountToWithdraw());
            }
        }
    }

    private static void transfer(Account from, Account to, BigDecimal amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
