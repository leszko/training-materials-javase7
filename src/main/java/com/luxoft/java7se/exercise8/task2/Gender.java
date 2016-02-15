package com.luxoft.java7se.exercise8.task2;

public enum Gender {
    MALE("Mr."), FEMALE("Ms.");

    private final String salutation;

    Gender(String salutation) {
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }
}
