package com.userdefinedcollections;
import java.util.*;
public class Teststudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*students s = new students(101, "Aniket", 25, 80);
students s1 = new students(102, "Ani", 24, 85);
System.out.println("printing using tostring");
System.out.println(s);
System.out.println(s1);
System.out.println("printing values using display");
	s.display();
	s1.display();
	System.out.println("printing values using getter");
	System.out.println(s.getstudentsid()+" "+s.getstudentsname()+" "+s.getstudentsage()+" "+s.getstudentsmarks());
	System.out.println(s1.getstudentsid()+" "+s1.getstudentsname()+" "+s1.getstudentsage()+" "+s1.getstudentsmarks());*/
	List<students>list=new ArrayList();
	students s[]=new students[2];
	for (int i=0; i<s.length; i++)
	{
		s[i]=new students(i, null, i, i);
		s[i].input();
	}
	//Collections.sort(list);

	for (int i=0;i<s.length; i++)
	{
		s[i].display();
	}
	

	
	
	}

}
