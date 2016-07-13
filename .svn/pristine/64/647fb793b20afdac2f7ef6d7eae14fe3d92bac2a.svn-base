package com.wilson.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.dao.PersonDAO;
import com.wilson.model.Person;

@Service
@ManagedBean(name="personService")
@SessionScoped
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;
	 
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
 
    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }
    
    @Override
    @Transactional
    public void removePerson(Person p) {
        this.personDAO.removePerson(p);
    }
 
    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
 
}
