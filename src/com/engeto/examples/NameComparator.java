package com.engeto.examples;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    public int compare(Person first, Person second) {
        int res = first.getSurName().compareTo(second.getSurName());

        if (res == 0) {
            res = first.getFirstName().compareTo(second.getFirstName());
        }

        return res;
    }
}
