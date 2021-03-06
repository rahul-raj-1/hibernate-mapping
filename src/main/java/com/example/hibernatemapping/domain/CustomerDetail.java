package com.example.hibernatemapping.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="CUSTOMER_DETAIL")
public class CustomerDetail {
	
	
	@Column(name="CUST_DET_ID")
	@Id
	@SequenceGenerator(name="s1")
    private Integer custDetialId;

	@Column(name="CUST_ID")
	private Integer custId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@OneToOne(mappedBy="customerDetail",cascade = CascadeType.ALL)
	@JsonBackReference
    private Customer customer;
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
		//this.customer.setCustomerDetail(this) ;
	}


	
	
	
	
	
	
	
	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getCustDetialId() {
		return custDetialId;
	}

	public void setCustDetialId(Integer custDetialId) {
		this.custDetialId = custDetialId;
	}

	public CustomerDetail() {
		
	}
	
	
	public CustomerDetail(Integer custDetialId, String firstName, String lastName) {
		super();
		this.custDetialId = custDetialId;
		this.firstName = firstName;
		this.lastName = lastName;
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
