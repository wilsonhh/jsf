package com.wilson.service;

import java.util.List;

import com.wilson.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public void removePerson(Person p);
    public List<Person> listPersons();
     
}