package com.example.hibernatemapping.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_DETAIL")
public class CustomerDetail {
	
	
	@Column(name="CUST_DET_ID")
	@Id
	@SequenceGenerator(name="s1")
    private Long custDetialId;

	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	

	public Long getCustDetialId() {
		return custDetialId;
	}

	public void setCustDetialId(Long custDetialId) {
		this.custDetialId = custDetialId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
