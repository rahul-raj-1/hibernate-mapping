package com.example.hibernatemapping.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_ROLES")
public class Role {
	
	
	@Column(name="ROLE_ID")
	@Id
	@SequenceGenerator(name="s1")
    private Integer roleId;

	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="IS_ROLE_ACTIVE")
	private Integer isRoleActive;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getIsRoleActive() {
		return isRoleActive;
	}

	public void setIsRoleActive(Integer isRoleActive) {
		this.isRoleActive = isRoleActive;
	}

 
	
	

	

}
