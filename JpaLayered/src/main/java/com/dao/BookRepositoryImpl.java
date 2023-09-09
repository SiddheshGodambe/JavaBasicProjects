	package com.dao;
	
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	
	import com.model.Book;
	
	public class BookRepositoryImpl implements BookRepository {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpalayered");
	private EntityManager em;
	
	
	public BookRepositoryImpl() {
	this.em=emf.createEntityManager();
	}
	
	public void saveBook(Book b) {
	em.getTransaction().begin();
	em.persist(b);
	em.getTransaction().commit();
	System.out.println("Persisted");
	}
	
	public Book getBookId(int bookId) {
			Book b=em.find(Book.class, bookId);
	    return b;
	}
	
	public void deleteBook(int bookId) {
			em.getTransaction().begin();
			Book b=em.find(Book.class,bookId);
			em.remove(b);
			em.getTransaction().commit();
	}
	
	}
