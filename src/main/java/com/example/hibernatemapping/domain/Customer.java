/**
 * 
 */
package com.example.hibernatemapping.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	private Integer id;

	@Column(name="NAME ")
	private String name;

	
	  @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	  @JoinColumn(name = "ID_COL", referencedColumnName = "CUST_ID") 
	  @JsonManagedReference 
      private  CustomerDetail customerDetail;
	 
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}

	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	    //this.customerDetail.setCustomer(this);
	}
	public Customer() {
		
	}
	

	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
