package com.example.hibernatemapping.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


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
@EnableGlobalMethodSecurity(prePostEnabled = true) //if we remove this @PreAuthorize wont work
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
    @Bean
	public AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDetailsService);
		
		//without the we will get password not mapped error
		//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); deprecated .Plain text password
		// Bcry is only working with bcrpt starting with $2a
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		
		return provider;
	}
	
	
	
	
	


}
