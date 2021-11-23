package com.engeto.examples;

public class Main {

    public static void main(String[] args) {
        System.out.println("xxx");
        Teacher teacher = new Teacher("Petr", "Novotny");
        Student student = new Student("Jan", "Molík", 2012, 1514);

        SchoolClass schoolClass = new SchoolClass(new Teacher("Petr", "Novotny"), 9, "B");
    }
}
