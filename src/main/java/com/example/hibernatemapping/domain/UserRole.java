/**
 * 
 */
package com.example.hibernatemapping.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author RAHUL-PC
 *
 */
@Entity
@Table(name="T_MAP_USER_ROLES")
public class UserRole {
	
	@Column(name="MAP_ID")
	@Id
	@SequenceGenerator(name="seq_user_role")
	private Integer mapId;

	@Column(name="USER_ID")
	private Integer userId;

	@Column(name="ROLE_ID ")
	private Integer roleId;
	
	@Column(name="IS_ACTIVE")
	private Integer isActive;

	
	
	  @OneToOne
	  @JoinColumns(
			    {
			      @JoinColumn(updatable=false,insertable=false, name="ROLE_ID", referencedColumnName="ROLE_ID"),
			    }
			    )
       private Role  role;

	public Integer getMapId() {
		return mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


	
	
	

}
