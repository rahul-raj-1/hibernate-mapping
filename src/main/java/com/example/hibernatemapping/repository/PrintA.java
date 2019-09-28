package com.example.hibernatemapping.repository;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PrintA implements Print{

	
	public void show() {
	
		
		System.out.println( " showing a ");
		
	}

	@Override
	public void show(Boolean b) {
		// TODO Auto-generated method stub
		
	}

}
