package com.pavlo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("TOM", 24));
        persons.add(new Person("And", 21));
        persons.add(new Person("wer", 20));
        System.out.println(sort(persons));
    }

    private static List<String> sort(List<Person> persons) {
        if (persons.size() == 0) {
            return null;
        }
        return persons.stream()
                .filter(p -> p.getAge() >= 21)
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}
