package com.coforge.springMVC.dao;

import java.util.List;

import com.coforge.springMVC.model.Employee;



public interface EmployeeDao {
	
	public void addEmployee(Employee employee);	
	
	public List <Employee> findAll();
	
	public void deleteEmployee(String name);

	

}
