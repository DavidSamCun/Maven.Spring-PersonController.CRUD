package controller;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class PersonController {

    private static final AtomicInteger counter = new AtomicInteger();
    private static List<Person> personList = new ArrayList<>();


    public Person createPerson(Person p){
        p.setId(counter.incrementAndGet());
        return p;
    }

    public Person getPerson(int id){

        return null;
    }

    public List<Person> getPersonList(){

        return null;
    }

    public Person updatePerson(Person p){

        return null;
    }

    public void deletePerson(int id){


    }
}
