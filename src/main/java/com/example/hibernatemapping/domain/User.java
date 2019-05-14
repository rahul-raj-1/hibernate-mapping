/**
 * 
 */
package com.example.hibernatemapping.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author RAHUL-PC
 *
 */
@Entity
@Table(name="T_USERS")
public class User {
	
	@Column(name="ID_COL")
	@Id
	@SequenceGenerator(name="s")
	private Integer userId;

	@Column(name="USER_NAME ")
	private String userName;

	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="PASSWORD")
	private String password;
	
	
	@Column(name="IS_ACTIVE")
	private Integer isActive;

	
	@OneToMany(	cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID",referencedColumnName="ID_COL")
	private List<UserRole> userRole =new ArrayList<>();
	

	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getIsActive() {
		return isActive;
	}


	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}


	public List<UserRole> getUserRole() {
		return userRole;
	}


	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}


	

	
	  
	  
	  
}


