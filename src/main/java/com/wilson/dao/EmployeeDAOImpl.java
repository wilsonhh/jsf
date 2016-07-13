package com.wilson.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.wilson.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	private SessionFactory sessionFactory;
	
    
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

	@Override
	public void save(Employee e) {
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(e);
        logger.info("Person saved successfully, Person Details="+e);

	}

	@Override
	public void delete(Employee e) {
		Session session = this.sessionFactory.getCurrentSession();
        session.delete(e);
        logger.info("Person removed successfully, Person Details="+e);

	}

	@Override
	public List<Employee> listAll() {
		Session session = this.sessionFactory.getCurrentSession();
        List<Employee> employeeList = session.createQuery("from Employee").list();
        for(Employee e : employeeList){
            logger.info("Employee List::"+e);
        }
        return employeeList;
	}

}
