package com.luxoft.java7se.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String address;
    List<String> phoneNumbers = new ArrayList<>();

    public void setAddress(String address) {
        this.address = address;
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public String getAddress() {
        return address;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address='" + address + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
