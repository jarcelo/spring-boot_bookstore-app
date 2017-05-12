package com.jarcelo.henrybooks.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "stores")
public class Store {
	@Id
	@Column(name ="storeId")
	private long id;
	
	@Column(name = "storeName")
	private String name;
	
	@Column(name = "storeAddr")
	private String address;
	
	@Column(name = "storeEmp")
	private long numberOfEmployees;
	
	
	public Store() {}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(long numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public String toString() {
		   return String.format("Branch Number: " + this.id + "<br>" +
	               "Branch Name: " + this.name + "<br>" +
	               "Branch Location: " + this.address);
	}
	
}
