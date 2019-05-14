package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatemapping.domain.UserRole;

public interface UserRoleRepository  extends JpaRepository<UserRole, Integer> {

}
