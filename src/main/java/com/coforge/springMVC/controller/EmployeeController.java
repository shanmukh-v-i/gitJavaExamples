package com.coforge.springMVC.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.springMVC.dao.EmployeeDao;
import com.coforge.springMVC.model.Employee;

@Controller
@RequestMapping(value="/")
public class EmployeeController {
	
	@Autowired    
    EmployeeDao employeeDao;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET) 
	public ModelAndView showEmployeeForm() { 
		Employee employee = new Employee(); 
	// Add the command object to the modelview 
		ModelAndView mv = new ModelAndView("employee"); 
		mv.addObject("employee", employee); 
	return mv; } 
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST) 
    public String save(@ModelAttribute("employee") Employee employee){    
        employeeDao.addEmployee(employee); 
		return "redirect:/viewemp"; 
	} 
	
	@RequestMapping(value="/viewemp")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Employee> listContact = employeeDao.findAll();
	    model.addObject("listContact", listContact);
	    
	    return model;
}
	@RequestMapping(value="/deleteemployee/{firstname}",method = RequestMethod.GET)    
    public String delete(@PathVariable String firstname){    
		employeeDao.deleteEmployee(firstname);    
        return "redirect:/viewemp";    
    } 
	
}
