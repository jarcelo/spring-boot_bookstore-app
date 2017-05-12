package com.jarcelo.henrybooks.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "booklist")
public class Book {
	@Id
	@Column(name = "bookID")
	private String id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name ="author")
	private String author;
	
	@Column(name = "publisher_code")
	private String publisherCode;
	
	@Column(name = "booktype")
	private String bookType;
	
	@Column(name = "price")
	private double price;
	
	
	public Book() { }

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisherCode() {
		return publisherCode;
	}

	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		   return String.format("Book Code: " + this.id + "<br>" +
	               "Book Title: " + this.title + "<br>" +
	               "Author: " + this.author);
	}
}
