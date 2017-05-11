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
	private long Id;
	
	@Column(name = "storeName")
	private String Name;
	
	@Column(name = "storeAddr")
	private String Address;
	
	@Column(name = "storeEmp")
	private long numberOfEmployees;
	
	
	public Store() {}
	

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(long numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
}
