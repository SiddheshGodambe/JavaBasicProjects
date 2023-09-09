package com.userdefinedcollections;
import java.util.*;
public class students implements Comparable<students>{
private int id;
private String name;
private int age;
private int marks;

students (int id, String name, int age, int marks) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.marks=marks;
}

public int getstudentsid()
{
	return id;
}
public String getstudentsname()
{
	return name;
}
public int getstudentsage()
{
	return age;
}
public int getstudentsmarks()
{
	return marks;
}
public void setstudentsid(int id)
{
	this.id=id;
}
public void setstudentaname(String name)
{
	this.name=name;
}
public void setstudentsage(int age)
{
	this.age=age;
}
public void setstudentsmarks(int marks)
{
	this.marks=marks;
}
public void input()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter id");
id=sc.nextInt();
System.out.println("Enter name");
name = sc.next();
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter marks");
marks=sc.nextInt();
}
public void display()
{
	System.out.println(id+" "+name+" "+age+" "+marks);
}
public String toString()
{
	return  id+" "+name+" "+age+" "+marks;
}

@Override
public int compareTo(students s) {
	// TODO Auto-generated method stub
	return (this.age-s.age);
}


}
