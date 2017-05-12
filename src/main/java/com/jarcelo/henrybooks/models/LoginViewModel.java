package com.jarcelo.henrybooks.models;

import javax.validation.constraints.NotNull;

public class LoginViewModel {
	@NotNull
	private long  userId;
	@NotNull
	private long password;
	
	public LoginViewModel(){
		userId = 0;
		password = 0;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
}
