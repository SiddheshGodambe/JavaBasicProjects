							package com.controller;

import java.util.Scanner;

import com.model.Book;
import com.service.BookService;
import com.service.BookServiceImpl;

class TestBookController {

	public static void main(String[] args) {
		
		String s;
		BookService bookService=(BookService) new BookServiceImpl();
		do {
			System.out.println("1. Insert book details");
			
			System.out.println("2. Find book details");
			
			System.out.println("3. Delete book details");
			
			System.out.println("4. Exit");
			 
			int choice=new Scanner(System.in).nextInt();
			
			
			switch(choice)
			{
			
			case 1:
				Book b =new Book();
				System.out.println("Enter book name");
				Scanner sc=new Scanner(System.in);
				String s1=sc.next();
				b.setBookName(s1);
				System.out.println("Enter price");
				int ab=sc.nextInt();
				b.setPrice(ab);
				bookService.insertBook(b);
				break;
				
			case 2:
				Book b1= new Book();
				System.out.println("Which book id you want to search");
				int id=new Scanner(System.in).nextInt();
				b1=bookService.searchBook(id);
				System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice());
				break;
				
			case 3:
				System.out.println("Which book do you want to delete");
				int id1= new Scanner (System.in).nextInt();
				bookService.deleteBook(id1);
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
			System.out.println("your choice is wrong");		
		}
		System.out.println("Do you want to continuoue...");
		s= new Scanner(System.in).next();
		}
		while(s.equals("yes"));
	}

}
