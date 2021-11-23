package com.engeto.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SchoolClass {
    private Teacher teacher;
    private Integer year;
    private String name;
    private List<Student> students;
    static String gapLine = "####################################\n";

    public SchoolClass(Teacher teacher, Integer year, String name) {
        this.teacher = teacher;
        this.year = year;
        this.name = name;
        this.students = new ArrayList<>();

    }

    public void sortStudent() {
        Collections.sort(this.students, new NameComparator());
    }



    public void addStudent(Student student) {
        this.students.add(student);
        sortStudent();


    }

    public String getFullName() {
        return this.year + "." + this.name;
    }

    public String getLongDescriptionOfClass() {

        String out;
        out = gapLine;
        out += "Třída " + this.getFullName() + " (ročník: " + this.year + ")\n";
        out += "Třídní učitel: " + this.teacher.getSurName() + ", " + this.teacher.getFirstName() + "\n";
        out += "Počet studentů: " + this.students.toArray().length + "\n";
        out += "\n" + gapLine;
        int i = 0;
        for (Student student: this.students) {
            i++;
            out += "# " + i + " # " + student.getFormatedId() + " - " + student.getFullName() + " ("
                    + student.getYearsOfBorn()+ ")\n";
        }
        return out;
    }

    public String getShortDescriptionOfClass() {
        String out;
        out = this.getFullName() + ", " + this.teacher.getFullName() + "\n";
        for (Student student: this.students) {
            out += student.getFormatedId() + ", " + student.getFullName() + "\n";
        }
        return out;

    }

    public String getMyDescriptionOfClass() {
        String out;
        out = this.getFullName() + ", " + this.teacher.getFullName() + "\n";
        out += gapLine;
        int i = 0;
        for (Student student: this.students) {
            i++;
            out += i + ". " + student.getFullName() + " / " + student.getYearsOfBorn() + "\n";
        }
        return out;
    }
}
