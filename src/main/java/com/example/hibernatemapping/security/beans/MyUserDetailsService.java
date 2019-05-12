/**
 * 
 */
package com.example.hibernatemapping.security.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.domain.User;
import com.example.hibernatemapping.repository.UserRepository;

/**
 * @author RAHUL-PC
 *
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userame) throws UsernameNotFoundException {
		 User user= userRepository.findByUserName(userame);
		 
		 System.out.println(   " user name is "  +  user.getUserName()) ;
		 System.out.println(   " password is "  +  user.getPassword()) ;

		 
		 return  new UserPrincipal(user);
	}

}
