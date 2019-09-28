package com.example.hibernatemapping.repository;

import org.springframework.stereotype.Service;

@Service
public class PrintB implements Print{

	public void show() {
	
		
		System.out.println( " showing b ");
		
	}

	@Override
	public void show(Boolean b) {
		// TODO Auto-generated method stub
		
	}

}
