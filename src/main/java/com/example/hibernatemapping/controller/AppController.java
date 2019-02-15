/**
 * 
 */
package com.example.hibernatemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.service.CustomerService;

/**
 * @author RAHUL-PC
 *
 */
@RestController
@RequestMapping("/api/customer")
public class AppController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
      public ResponseEntity<?> findAll()
	{
		return  ResponseEntity.ok(customerService.findAll());
	}
	
	
	
	
}
