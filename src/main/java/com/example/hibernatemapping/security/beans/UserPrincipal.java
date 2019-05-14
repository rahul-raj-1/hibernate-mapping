package com.example.hibernatemapping.security.beans;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.hibernatemapping.domain.User;
import com.example.hibernatemapping.domain.UserRole;

public class UserPrincipal implements UserDetails {
	
	// we need the user entity to get the password,username etc from our Database
	private User user;
	public UserPrincipal(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		 List<UserRole> userRole = user.getUserRole();
		  Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

		 
		 for (UserRole ur : userRole)
		 {
			  authorities.add(new SimpleGrantedAuthority(ur.getRole().getRoleName()));

			 
		 }
		 
		
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//created method to get email .
	public String getUserEmail() {
		// TODO Auto-generated method stub
		return user.getUserEmail();
	}
	
	
	
	

}
