package com.coforge.springMVC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coforge.springMVC.model.Employee;

@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 
@Qualifier("employeedao") //qualifier mentions that if we have same name of id to avoid 
//the conflict of same names we use @Qualifier 
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired 
	JdbcTemplate jdbcTemplate; 
	public void addEmployee(Employee employee) {
		jdbcTemplate.update("insert into employee(firstname,lastname,department) values('"+employee. getFirstName()+"','"+employee. getLastName()+"','"+employee. getDepartment()+"')");    
	   		
	}

	
	public List<Employee> findAll() {
		 return jdbcTemplate.query("select * from employee",new RowMapper<Employee>(){    
		        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
		            Employee e=new Employee();    
		            e.setFirstName(rs.getString("firstname"));    
		            e.setLastName(rs.getString("lastname"));    
		            e.setDepartment(rs.getString("department"));    
		                
		            return e;    
		        }				    
		    });    
		}


	@Override
	public void deleteEmployee(String name) {
		String sql="delete from employee where firstname=?";    
	    jdbcTemplate.update(sql,name);
		
	}    

}
