package com.engeto.examples;

public class Person {
    String firstName;
    String surName;

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getFullName() {
        return this.firstName + " " + this.surName;
    }


}
