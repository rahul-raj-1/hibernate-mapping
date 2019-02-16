/**
 * 
 */
package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.domain.Customer;

/**
 * @author RAHUL-PC
 *
 */
@Repository /// code will work withour=t Repositry annotations too
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
