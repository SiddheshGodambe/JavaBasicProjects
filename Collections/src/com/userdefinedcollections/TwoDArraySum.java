	package com.userdefinedcollections;
	import java.util.Scanner;
	public class TwoDArraySum {
		
	public static int[][] input() {
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in) ;
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		System.out.println("Enter elements of Array");
		for (int i=0; i<a.length ; i++) {
			
			for(int j=0; j<a[i].length; j++ ) {
			a[i][j]=sc.nextInt();
		    }
		}
		return a;
	}
	
		public static void display(int a[][]) {
			
			
			for (int i=0; i<a.length ; i++) {
				
				for(int j=0; j<a[i].length; j++ ) {
			
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		public static int sum(int a [][]) {
			int sum=0;
			
			for (int i=0; i<a.length ; i++) {
				
				for(int j=0; j<a[i].length; j++ ) {
					if(i==j) {
						sum+=a[i][j];
					}
				}
			
		}
			return sum;
		}
		public static int sumS(int a[][]) {

			int sumL=0;
			
			for (int i=0; i<a.length ; i++) {
				
				for(int j=0; j<a[i].length; j++ ) {
			if(i+j==a.length-1)
				sumL+=a[i][j];
				}
			}
			return sumL;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int b [][]=input();
          
          display(b);
          int s= sum(b);
          System.out.println("sum of diagonal elements:"+s);
         
          int l=sumS(b);
          System.out.println("sum of secondary diagonal:"+l);
     }
}