package com.example.hibernatemapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.hibernatemapping")
public class ConfigClass {
	
	
	
	
	public String  getName()
	{
		return "rahul";
	}

}
