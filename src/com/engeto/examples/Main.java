package com.engeto.examples;

public class Main {

    public static void main(String[] args) {

        SchoolClass schoolClass = new SchoolClass(new Teacher("Petr", "Novotny"), 3, "B");

        schoolClass.addStudent(new Student("Mirka", "Maříková", 2011, 158));
        schoolClass.addStudent(new Student("Petr", "Kovář", 2012, 1044));
        schoolClass.addStudent(new Student("Jan", "Kovář", 2013, 1088));
        schoolClass.addStudent(new Student("Jana", "Juračková", 2012, 11));
        schoolClass.addStudent(new Student("Petra", "Malá", 2011, 18));
        System.out.println(schoolClass.getLongDescriptionOfClass());
        System.out.println("\n\nKrátký výpis:\n");
        System.out.println(schoolClass.getShortDescriptionOfClass());
    }
}
