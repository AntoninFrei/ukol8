package com.engeto.examples;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private Teacher teacher;
    private Integer year;
    private String name;
    private List<Student> students;

    public SchoolClass(Teacher teacher, Integer year, String name) {
        this.teacher = teacher;
        this.year = year;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);

    }

    public String getFullName() {
        return this.year + "." + this.name;
    }

    public String getLongDescriptionOfClass() {
        String gapLine = "####################################\n";
        String out;
        out = gapLine;
        out += "Třída " + this.getFullName() + " (ročník: " + this.year + ")\n";
        out += "Třídní učitel: " + this.teacher.getSurName() + ", " + this.teacher.getFirstName() + "\n";
        out += "Počet studentů: " + this.students.toArray().length + "\n";
        out += gapLine + "\n";
        return out;
    }
}
