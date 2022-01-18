package com.blackout.spring.dao;

import com.blackout.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"John"));
        people.add(new Person(++PEOPLE_COUNT,"Matthew"));
        people.add(new Person(++PEOPLE_COUNT,"Aaron"));
        people.add(new Person(++PEOPLE_COUNT,"Emma"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
