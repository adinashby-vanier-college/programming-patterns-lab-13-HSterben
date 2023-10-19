package com.prog2.labs;

public class PersonFactory {

    public static int count = 0;

    public Person createPerson(String name) {
        
        Person p = new Person(count++, name);
        return p;
    }
}
