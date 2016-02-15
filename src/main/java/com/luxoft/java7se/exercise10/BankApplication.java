package com.luxoft.java7se.exercise10;

import com.luxoft.java7se.exercise10.domain.*;
import com.luxoft.java7se.exercise10.exception.ClientExistsException;
import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;
import com.luxoft.java7se.exercise10.service.BankService;

import java.math.BigDecimal;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankService bankService = new BankService();

        Client rafal = new Client("rafal", Gender.MALE);
        Client andy = new Client("andy", Gender.MALE);
        Client maria = new Client("maria", Gender.FEMALE);
        rafal.addAccount(new SavingAccount(new BigDecimal(10.4)));
        andy.addAccount(new SavingAccount(new BigDecimal(15)));
        maria.addAccount(new CheckingAccount(new BigDecimal(20), new BigDecimal(12.5)));
        try {
            bankService.addClient(bank, rafal);
            bankService.addClient(bank, andy);
            bankService.addClient(bank, maria);
        } catch (ClientExistsException e) {
            e.printStackTrace();
        }

        printMaximumAmountToWithdraw(bank);
        transfer(rafal.getAccounts().get(0), maria.getAccounts().get(0), new BigDecimal(100));
    }

    private static void printMaximumAmountToWithdraw(Bank bank) {
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccounts()) {
                System.out.println("Client: " + client.toString() + " maximum to withdraw: " + account.maximumAmountToWithdraw());
            }
        }
    }

    private static void transfer(Account from, Account to, BigDecimal amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (NotEnoughFundsException e) {
            System.out.println("Cannot withdraw money. Maximum available is " + e.getAmount());
        }
    }
}
