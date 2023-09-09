	package com.service;
	
	import com.dao.BookRepository;
	import com.dao.BookRepositoryImpl;
	import com.model.Book;
	
	public class BookServiceImpl implements BookService {
	
	private BookRepository bookrepo;
	
	public BookServiceImpl(){
		
	  bookrepo= new BookRepositoryImpl();
	}

	public void insertBook(Book b) {
		
		bookrepo.saveBook(b);
	}

	public Book searchBook(int bookId) {
		Book b = bookrepo.getBookId(bookId);
		return b;
	}

	public void deleteBook(int bookId) {
		bookrepo.deleteBook(bookId);
	}

}
