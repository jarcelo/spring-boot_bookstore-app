package com.jarcelo.henrybooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarcelo.henrybooks.models.Book;
import com.jarcelo.henrybooks.models.BookDao;

@Controller
public class BookController {
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping("/book/count")
	@ResponseBody
	public String count() {
		long bookCount;
		try {
			bookCount = bookDao.count();
		} catch (Exception e) {
			return "Error retrieving book count " + e.getMessage();
		}
		return "Number of books: " + bookCount;
	}
	
	@RequestMapping("/book/get")
	@ResponseBody
	public String getBook(String id) {
		Book book = bookDao.findOne(id);
		return "" + book;
	}
}
