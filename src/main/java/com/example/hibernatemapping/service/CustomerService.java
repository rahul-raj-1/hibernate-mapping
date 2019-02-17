/**
 * 
 */
package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.domain.Customer;
import com.example.hibernatemapping.domain.CustomerDetail;

/**
 * @author RAHUL-PC
 *
 */
public interface CustomerService {
	
	
	
	List<Customer> findAll();
	List<CustomerDetail> findAllCustomerDetail();
	

}
