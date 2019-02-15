/**
 * 
 */
package com.example.hibernatemapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author RAHUL-PC
 *
 */
@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Column(name="ID_COL")
	@Id
	@SequenceGenerator(name="s")
	private Long id;

	@Column(name="NAME ")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
