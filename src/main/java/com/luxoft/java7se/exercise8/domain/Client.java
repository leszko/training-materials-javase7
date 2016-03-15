package com.luxoft.java7se.exercise8.domain;

public class Client {

    private String name;
    private Gender gender;
    private Account account;

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setAccount(Account inputAccount) {
        this.account = inputAccount;
    }

    public Account getAccount() {
        return this.account;
    }

    private String clientSalutation() {
        if (this.gender == Gender.MALE) {
            return "Mr. " + this.name;
        } else {
            return "Ms. " + this.name;
        }
    }

    @Override
    public String toString() {
        return "\ncom.luxoft.java7se.exercise8.domain.Client{" +
                clientSalutation() +
                ", account=" + account +
                '}';
    }
}
