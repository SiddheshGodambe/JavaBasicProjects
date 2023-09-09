package com.userdefinedcollections;
import java.util.Scanner;
public class worker{
	private int id;
	private int age;
	private String name;
	private int attendence;
	
	worker(int id, int age, String name, int attendence ){
		this.id=id;
		this.age=age;
		this.name=name;
		this.attendence=attendence;
	}
	public int getid()
	{
		return id;
	}
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	public int getattendence()
	{
		return attendence;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setattendence(int attendence)
	{
		this.attendence=attendence;
	}
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Attendence");
		attendence=sc.nextInt();
	}
	public void display()
	{
		System.out.println(id+" "+age+" "+name+" "+attendence);
	}
}



