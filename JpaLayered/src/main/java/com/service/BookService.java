package com.service;

import com.model.Book;

public interface BookService {
	void insertBook(Book b);
	Book searchBook(int bookId);
	void deleteBook(int bookId);

}
