package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	
	
	User findByUserName( String userName) ;
	
	
}
