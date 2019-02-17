/**
 * 
 */
package com.example.hibernatemapping.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.domain.Customer;
import com.example.hibernatemapping.domain.CustomerDetail;
import com.example.hibernatemapping.repository.CustomerDetailRepository;
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
    
    @Autowired
   	private CustomerDetailRepository customerRepositoryDetail;

	@Override
	public List<Customer> findAll() {
		
		 List<Customer> list = customerRepository.findAll();
		  for ( Customer c : list )
		  {
			  if( c.getCustomerDetail()!=null)
			  System.out.println( c.getCustomerDetail().getFirstName());
		  }
		
		return customerRepository.findAll();
	}

	@Override
	public List<CustomerDetail> findAllCustomerDetail() {
		// TODO Auto-generated method stub
		return customerRepositoryDetail.findAll();
	}
    
    
    
    

}
