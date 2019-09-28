package com.example.hibernatemapping.config;

import javax.transaction.Transactional;

import org.springframework.transaction.annotation.Propagation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

	
	@JsonProperty(value="id")
	Long id;
	
	@JsonProperty(value="employee_name")
	String employeeName ;
	
	@JsonProperty(value="employee_age")
     String employeeAge;
   
	@JsonProperty(value="employee_salary")
     String employeeSalary; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
    
    
    
    
    
    
}
