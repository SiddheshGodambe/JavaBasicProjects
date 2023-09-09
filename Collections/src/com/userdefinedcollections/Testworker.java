package com.userdefinedcollections;
import java.util.*;
public class Testworker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<worker>list= new ArrayList();
worker w[]=new worker[3];
for (int i=0; i<w.length; i++ )
{
	w[i]=new worker(i, i, null, i);
	w[i].input();
}
for(int i=0; i<w.length; i++ )
{
	w[i].display();
}	
	}
}
