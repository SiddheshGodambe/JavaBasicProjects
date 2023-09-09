package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookId;
private String bookName;
private int Price;
public Book() {
	super();
}
public Book(int bookId, String bookName, int price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	Price = price;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}

}
