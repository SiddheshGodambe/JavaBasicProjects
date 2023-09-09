	package com.dao;
	
	import com.model.Book;
	
	public interface BookRepository {
	void saveBook(Book b);
	Book getBookId(int bookId);
	void deleteBook(int bookId);
	
	}
