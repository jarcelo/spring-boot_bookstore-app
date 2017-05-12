package com.jarcelo.henrybooks.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name ="bookinv")
public class Inventory {
	@Id
	@Column(name = "ID")
	private long Id;
	
	@Column(name = "bookID")
	private String bookId;
	
	@Column(name = "storeID")
	private long storeId;
	
	@Column(name = "OnHand")
	private long booksOnHand;
	
	//@OneToMany(fetch = FetchType.EAGER)
	//@JoinColumn(name = "bookID", insertable = false, updatable = false)
	//private Book book;
	//@OneToMany(mappedBy = "bookId", cascade = CascadeType.ALL)
	//private Set<Book> books;

	
	public Inventory() {}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getBooksOnHand() {
		return booksOnHand;
	}

	public void setBooksOnHand(long booksOnHand) {
		this.booksOnHand = booksOnHand;
	}
	
}
