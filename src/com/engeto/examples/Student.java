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

    public Integer getYearsOfBorn() {
        return yearsOfBorn;
    }

    public Integer getId() {
        return id;
    }

    public String getFormatedId() {
        String out;
        out = this.id.toString();
        for (int i = out.length(); i < 4; i++) {
            out = "0" + out;
        }
        out = "ID" + out;

        return out;
    }
}
