package com.jarcelo.henrybooks.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarcelo.henrybooks.models.Book;
import com.jarcelo.henrybooks.models.Inventory;
import com.jarcelo.henrybooks.models.InventoryDao;
import com.jarcelo.henrybooks.models.Store;

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
	
	
	@RequestMapping("/inventory")
	@PostMapping
	public String getAllBooks(Model model, @ModelAttribute Store store) {
		List<Inventory> inventories = new ArrayList<>();
		inventories = (List<Inventory>)inventoryDao.findByStoreId(store.getId());
		model.addAttribute("inventories", inventories);
		return "inventory";
	}
}
