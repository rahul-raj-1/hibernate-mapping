/**
 * 
 */
package com.example.hibernatemapping.controller;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.hibernatemapping.domain.Student;
import com.example.hibernatemapping.domain.User;
import com.example.hibernatemapping.domain.UserRole;
import com.example.hibernatemapping.repository.Print;
import com.example.hibernatemapping.repository.UserRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author RAHUL-PC
 *
 */
@RestController
//@Controller
@RequestMapping(value = "/api")
public class AppController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private DataSource ds;

	@RequestMapping(value = "/home/{id1}", method = RequestMethod.PUT, consumes = { "application/json",
			"application/xml" })
	private String home(@PathVariable("id1") Long idValue, @RequestBody @Valid Student s) {

		System.out.println(" userRepository is  " + userRepository.hashCode());

		System.out.println(" Student -->" + s.getName() + " -- " + s.getId());

		return "job done";

	}

	@RequestMapping(value = "/foos",method = RequestMethod.GET)
	// @ResponseBody                             //by default required = true
	private String getFoos(@RequestParam(value = "t1", required = false) int id) throws SQLException {

		// int i=1;

		User u = userRepository.findByUserName("Rahul");

		for (UserRole r : u.getUserRole()) {

			System.out.println(" Roles are " + r.getRole().getRoleId());

		}

		return "ID: " + id + "  status: Success";

	}

	@RequestMapping("/admin")
	// @RequestBody
	private ResponseEntity<?> adminPage() {
		
		

		return ResponseEntity.ok("Hello Admnin");

	}
	
	
	@RequestMapping(value = "/username", method = RequestMethod.GET)
	@ResponseBody
	public String currentUserName(Authentication authentication) {
		
		System.out.println( " auth is " + authentication);
	return authentication.name();
	}

}
