package com.example.hibernatemapping.domain;

import javax.validation.constraints.Size;

public class Student  {

	Long id ;
	
	
    @Size(min =1, max =5)
     String name;

	public Long getId()  {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
