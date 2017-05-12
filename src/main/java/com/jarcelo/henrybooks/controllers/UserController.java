package com.jarcelo.henrybooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarcelo.henrybooks.models.User;
import com.jarcelo.henrybooks.models.UserDao;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/")
	@ResponseBody
	public String count(){
		long userCount = 0;
		try {
			userCount = userDao.count();
		} catch (Exception e) {
			return "Error getting user count";
		}
		return "User count: " + userCount;
	}
	
	@RequestMapping("/user/get")
	@ResponseBody
	public User getUserById(long id) {
		User user = userDao.findOne(id);
		return user;
	}
	
	@RequestMapping("/user/validate")
	@ResponseBody 
	public String getUserById(long id, long password) { //use model to simplify parameters
		User user = userDao.findOne(id);
		if (user.getPassword() == password) {
			return "User found: " + user;
		}
		else {
			return "Invalid user or password";
		}
	}
	
}
