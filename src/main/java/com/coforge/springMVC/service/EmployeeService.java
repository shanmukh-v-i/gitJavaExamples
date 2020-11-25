package com.coforge.springMVC.service;

import java.util.List;

import com.coforge.springMVC.model.Employee;

public interface EmployeeService {
	
public void addEmployee(Employee employee);	
	
	public List <Employee> findAll();
	
	public void deleteEmployee(String name);


}
