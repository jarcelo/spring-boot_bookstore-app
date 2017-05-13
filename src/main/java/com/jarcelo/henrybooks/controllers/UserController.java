package com.jarcelo.henrybooks.controllers;

import java.util.ArrayList;
import java.util.List;

//import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.jarcelo.henrybooks.models.LoginViewModel;
//import com.jarcelo.henrybooks.models.User;
//import com.jarcelo.henrybooks.models.UserDao;
import com.jarcelo.henrybooks.models.*;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private StoreDao storeDao;
	
//	@RequestMapping("/")
//	@ResponseBody
//	public String count(){
//		long userCount = 0;
//		try {
//			userCount = userDao.count();
//		} catch (Exception e) {
//			return "Error getting user count";
//		}
//		return "User count: " + userCount;
//	}
	
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
	
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getUser(Model model, @PathVariable long id) {
		User user = new User();
		user = userDao.findOne(id);
		model.addAttribute("user", user);
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String login(Model model, @ModelAttribute LoginViewModel loginModel) {
		User user = userDao.findOne(loginModel.getUserId());
		if(user != null && (user.getPassword() == loginModel.getPassword())) {
			model.addAttribute("user", user);
			List<Store> store = new ArrayList<>();
			model.addAttribute("store", store);
			List<Store> stores = new ArrayList<>();
			// Get all stores
			stores = (List<Store>)storeDao.findAll();
			model.addAttribute("stores", stores);
			return "store";
		}
		else {
			String errorMessage = "Invalid user ID or password. Please try again";
			model.addAttribute("user", new LoginViewModel());
			model.addAttribute("errorMessage", errorMessage);
			return "login";
		}
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("user", new LoginViewModel());
		return "login";
	}
}
