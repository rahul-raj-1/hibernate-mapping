/**
 * 
 */
package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatemapping.model.Customer;

/**
 * @author RAHUL-PC
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
