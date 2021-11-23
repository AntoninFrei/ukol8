package com.engeto.examples;

public class Student extends Person{
    private Integer yearsOfBorn;
    private Integer id;

    public Student(String firstName, String surName, Integer yearsOfBorn, Integer id) {
        super.firstName = firstName;
        super.surName = surName;
        this.yearsOfBorn = yearsOfBorn;
        this.id =id;
    }
}
