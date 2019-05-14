/**
 * 
 */
package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hibernatemapping.domain.User;
import com.example.hibernatemapping.domain.UserRole;
import com.example.hibernatemapping.repository.UserRepository;
import com.example.hibernatemapping.repository.UserRoleRepository;

/**
 * @author RAHUL-PC
 *
 */
@Controller
//@PreAuthorize("hasAuthority('MANGER')")
public class AppController {

   @Autowired
	private UserRepository userRepository;
	  @RequestMapping("/")
      public String home()
	{
	
		return "home.jsp";		
		
	}
	
	
	  @RequestMapping("/admin")
	 @Secured(value = { "ADMIN" }) //	  @PreAuthorize("hasAuthority('ADMIN')") will also work
     public String adminPage()
	{
	
		return "admin.jsp";		
		
	}
	
	
	
}
