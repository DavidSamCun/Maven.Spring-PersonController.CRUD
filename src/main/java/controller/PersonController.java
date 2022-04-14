package controller;

import model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private static final AtomicInteger counter = new AtomicInteger();
    private static List<Person> personList = new ArrayList<>();


    public Person createPerson(Person p){           //Return person? Why?
        p.setId(counter.incrementAndGet());
        personList.add(p);
        return p;
    }

    public Person getPerson(int id){
        for(Person person : personList){
            if(person.getId() == id){
                return person;
            }
        }

        return null;
    }

    public List<Person> getPersonList(){
        return personList;
    }

    public Person updatePerson(Person p){       //Add options for this?

        return null;
    }

    public void deletePerson(int id){
        Person person = getPerson(id);
        personList.remove(person);
    }
}
