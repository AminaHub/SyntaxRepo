package com.class14;

public class Task8 {

	public static void main(String[] args) {
		// 8. Write a Java Program to print first 10 numbers of Fibonacci series.
		
	 int f=0;
	 int f2=1;
	 int sumOfPrev=0;
	 	 
	System.out.println("Fibonacci series of 10 is: "); 
	 for(int i=0; i<10; i++) {
		 
		sumOfPrev=f+f2;
		f=f2;
		f2=sumOfPrev;
		System.out.print(f+" ");
	}
	 

	}

}
