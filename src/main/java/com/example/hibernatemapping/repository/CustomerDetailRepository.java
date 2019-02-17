
package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.domain.CustomerDetail;

@Repository
public interface CustomerDetailRepository  extends JpaRepository<CustomerDetail, Long> {

}
