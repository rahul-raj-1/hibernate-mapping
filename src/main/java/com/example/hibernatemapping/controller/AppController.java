/**
 * 
 */
package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.domain.Customer;
import com.example.hibernatemapping.domain.CustomerDetail;
import com.example.hibernatemapping.service.CustomerService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author RAHUL-PC
 *
 */
@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	  @RequestMapping("/customer")
      public ResponseEntity<?> findAll()
	{
		//return  ResponseEntity.ok(customerService.findAllCustomerDetail());
		          
		 List<Customer > list = customerService.findAll();
		 
		 for ( Customer c : list)
		 {
			 
			System.out.println( c.getName());
			if (c.getCustomerDetail()!=null)
			{
				System.out.println(c.getCustomerDetail().getFirstName());
			}
		 }
		 
		
		return  ResponseEntity.ok(list);
	}
	
	@GetMapping
	  @RequestMapping("/customerDetail")
    public ResponseEntity<?> findAllCustomerDetail()
	{

		//weird behavior
		// Although mapping is bi direction 1to1 
		// but when u call CustDetail repo findall,we wont get Customer as JSON response 
		//but we print the values in console and set it to DTO and return as response
		
		//To get Cust and CustDeta as JSON response change the @JsonBackReference to @JsonManagedReference
		//in CustDetail entity and vice versa in Customer entity .But then our CustomerRepo.findall()
		//will only return Customer data and not Cust Detail data 
		 List<CustomerDetail > list = customerService.findAllCustomerDetail();
		 
		 for ( CustomerDetail c : list)
		 {
			 
			System.out.println( c.getFirstName());
			 if ( c.getCustomer()!=null)
				 System.out.println(c.getCustomer().getId());
		 }
		 
		
		return  ResponseEntity.ok(list);
	}
	
	
	
	
}
