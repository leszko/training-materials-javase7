package com.luxoft.java7se.exercise10;

import com.luxoft.java7se.exercise10.domain.Bank;
import com.luxoft.java7se.exercise10.domain.Client;
import com.luxoft.java7se.exercise10.domain.Gender;
import com.luxoft.java7se.exercise10.domain.SavingAccount;
import com.luxoft.java7se.exercise10.exception.ClientExistsException;
import com.luxoft.java7se.exercise10.exception.NotEnoughFundsException;
import com.luxoft.java7se.exercise10.exception.OverDraftLimitExceededException;
import com.luxoft.java7se.exercise10.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankService bankService = new BankService();

        Client client1 = new Client("rafal", Gender.MALE);
        client1.setAccount(new SavingAccount(10.4));

        Client client2 = new Client("john", Gender.MALE);
        client2.setAccount(new SavingAccount(20.4));

        try {
            bank.addClient(client1);
            bank.addClient(client2);
            bankService.transfer(client1.getAccount(), client2.getAccount(), 20.0);
        } catch (ClientExistsException e) {
            System.out.println("Client with that name already exist");
        } catch (OverDraftLimitExceededException e) {
            System.out.println("Transfer cannot be perfomed, not enough money, overdraft exceeded\n" +
                    "Account: " + e.getAccount() + "\n" +
                    "maximum amount to withdraw: " + e.getMaxiumAmountToWithdraw());
        } catch (NotEnoughFundsException e) {
            System.out.println("Transfer cannot be perfomed, not enough money\n" +
                    "Account: " + e.getAccount() + "\n" +
                    "maximum amount to withdraw: " + e.getMaxiumAmountToWithdraw());
        }
    }
}
