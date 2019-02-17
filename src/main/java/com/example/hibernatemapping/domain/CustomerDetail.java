package com.example.hibernatemapping.domain;

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
    private Long custDetialId;

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
		this.customer.setCustomerDetail(this) ;
	}


	public Long getCustDetialId() {
		return custDetialId;
	}

	public void setCustDetialId(Long custDetialId) {
		this.custDetialId = custDetialId;
	}
	
	
	
	
	
	
	
	public CustomerDetail() {
		
	}
	
	
	public CustomerDetail(Long custDetialId, String firstName, String lastName) {
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
