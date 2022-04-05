package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a ITPerson storage on Object base with Generics.
 */
public class GenericStorage<T extends ITPerson> {

    List<T> persons = new ArrayList<T>();

    public boolean storePerson(T person) {
        return persons.add(person);
    }

    public T getLastStoredPerson() {
        return persons.get(persons.size()-1);
    }

    public T getFirstStoredPerson() {
        return persons.get(0);
    }

}
