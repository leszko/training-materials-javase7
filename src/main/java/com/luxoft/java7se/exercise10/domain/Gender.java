package com.luxoft.java7se.exercise10.domain;

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
