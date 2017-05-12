package com.jarcelo.henrybooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarcelo.henrybooks.models.InventoryDao;

@Controller
public class InventoryController {
	
	@Autowired
	private InventoryDao inventoryDao;
	
	@RequestMapping("/inventory/count")
	@ResponseBody
	public String count() {
		long inventoryCount;
		try {
			inventoryCount = inventoryDao.count();
		} catch (Exception e) {
			return "Error retrieving inventory count :" + e.getMessage();
		}
		return "Inventory Count : " + inventoryCount;
	}
}
