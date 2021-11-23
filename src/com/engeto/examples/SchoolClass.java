package com.engeto.examples;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private Teacher teacher;
    private Integer year;
    private String name;
    private List<Student> students = new ArrayList<>();

    public SchoolClass(Teacher teacher, Integer year, String name) {
        this.teacher = teacher;
        this.year = year;
        this.name = name;
    }
}
