package com.coforge.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.springMVC.dao.EmployeeDao;
import com.coforge.springMVC.model.Employee;


@Service("employeeservice")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeDao.findAll();
	}

	@Override
	public void deleteEmployee(String name) {
		employeeDao.deleteEmployee(name);
		
	}

}
