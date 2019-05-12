package com.example.hibernatemapping.security;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


/*The answer is inside your question. when you are using a different authentication system, 
 * and the password is not provided in your own database/data model,
 *  you have to use the AuthenticationProvider. for example, I've worked in a project that the customer 
 *  had a centralized authentication system (CAS), so my system had no idea about the password,
I had to implement the AuthenticationProvider and send the given password to the CAS, 
and act according to its answer.But in another system, I was storing the password in my database, so 
all I had to do was implementing the UserDetailsService and check if the user exists 
in my database or not, spring-security had to do the rest.
*/
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	@Autowired
	private DataSource dataSource ;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@SuppressWarnings("deprecation")
	@Bean
	protected UserDetailsService userDetailsService()
	{
		
		List<UserDetails> user = new ArrayList<>();
		
	
		user.add(User.withDefaultPasswordEncoder().username("RAHUL").password("RAHUL").roles("ADMIN").build());
		return new InMemoryUserDetailsManager(user);
	}
	
	
	
	


}
