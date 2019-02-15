/**
 * 
 */
package com.example.hibernatemapping.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.model.Customer;
import com.example.hibernatemapping.repository.CustomerRepository;
import com.example.hibernatemapping.service.CustomerService;

/**
 * @author RAHUL-PC
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	
    @Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		
		
		return customerRepository.findAll();
	}
    
    
    
    

}
