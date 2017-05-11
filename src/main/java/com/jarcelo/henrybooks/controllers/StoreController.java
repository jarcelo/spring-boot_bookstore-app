package com.jarcelo.henrybooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarcelo.henrybooks.models.StoreDao;

@Controller
public class StoreController {
	@Autowired
	private StoreDao storeDao;
	
	@RequestMapping("/store/count")
	@ResponseBody
	public String count() {
		long storeCount;
		try {
			storeCount = storeDao.count();
		} catch (Exception e) {
			return "Error retrieving store count " + e.getMessage();
		}
		return "Number of stores: " + storeCount;
	}
}
