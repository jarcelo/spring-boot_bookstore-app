package com.jarcelo.henrybooks.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {
	
	@Id
	@Column(name ="userId")
	private double Id;
	
	@Column(name ="userName")
	private String name;
	
	@Column(name ="userPassword")
	private double password;
	
	@Column(name = "storeID")
	private double storeId;
	
	@Column(name ="adminLevel")
	private String adminLevel;
	
	
	public User(){}
	

	public double getId() {
		return Id;
	}

	public void setId(double id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public double getStoreId() {
		return storeId;
	}

	public void setStoreId(double storeId) {
		this.storeId = storeId;
	}

	public String getAdminLevel() {
		return adminLevel;
	}

	public void setAdminLevel(String adminLevel) {
		this.adminLevel = adminLevel;
	}
}
