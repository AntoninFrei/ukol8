package com.engeto.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        SchoolClass schoolClass = new SchoolClass(new Teacher("Petr", "Novotny"), 3, "B");

        schoolClass.addStudent(new Student("Mirka", "Maříková", 2011, 158));
        schoolClass.addStudent(new Student("Petr", "Kovář", 2012, 1044));
        schoolClass.addStudent(new Student("Jan", "Kovář", 2013, 1088));
        schoolClass.addStudent(new Student("Jana", "Juračková", 2012, 11));
        schoolClass.addStudent(new Student("Petra", "Malá", 2011, 18));
        System.out.println("\n\nDlouhý výpis:\n");
        System.out.println(schoolClass.getLongDescriptionOfClass());
        System.out.println("\n\nKrátký výpis:\n");
        System.out.println(schoolClass.getShortDescriptionOfClass());
        System.out.println("\n\nMůj výpis:\n");
        System.out.println(schoolClass.getMyDescriptionOfClass());

        try {

            exportToFile("dlouhy_vypis", schoolClass.getLongDescriptionOfClass());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            exportToFile("kratky_vypis", schoolClass.getShortDescriptionOfClass());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            exportToFile("muj_vypis", schoolClass.getMyDescriptionOfClass());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

    public static void exportToFile(String fileName, String stringOfFile) throws FileNotFoundException {
        fileName = fileName + ".txt";
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writer.println(stringOfFile);
        } catch (FileNotFoundException e) {
            throw  new FileNotFoundException("Chyba při zápisu do souboru: " + fileName +"!");
        }
    }

}
