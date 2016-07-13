package com.wilson.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.dao.EmployeeDAO;
import com.wilson.model.Employee;

@Service
@ManagedBean(name="employeeService")
@SessionScoped
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	 
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

	@Override
	@Transactional
	public void save(Employee e) {
		employeeDAO.save(e);

	}

	@Override
	@Transactional
	public void delete(Employee e) {
		employeeDAO.delete(e);

	}

	@Override
	@Transactional
	public List<Employee> listAll() {
		return employeeDAO.listAll();
	}

}
