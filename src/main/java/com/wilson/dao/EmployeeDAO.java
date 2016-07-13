package com.wilson.dao;

import java.util.List;

import com.wilson.model.Employee;

public interface EmployeeDAO {
	
	public void save(Employee e);
	public void delete(Employee e);
	public List<Employee> listAll();

}
