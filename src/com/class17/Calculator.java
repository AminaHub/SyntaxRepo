package com.class17;

import java.util.Scanner;

//import com.Class17_2.copy.ScannerMethod;


public class Calculator {

	// we don't need a main method if we are not going to use it to call the methods
//	public static void main(String[] args) {
//		Calculator obj = new Calculator();
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please enter two integers: ");
//		
//		int a= scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("The sum of two integers is: ");
//		obj.sum(a, b);
//		
//		System.out.println("The difference of two integers is: ");
//		obj.sub(a, b);
//		
//		System.out.println("The division of two integers is: ");
//		obj.div(a, b);
//		
//		System.out.println("The multiplication of two integers is: ");
//		obj.mult(a, b);
//		//obj.sum(12, 13);
//		//obj.sm(100,100);
//		
//		//obj.sub();
//		//obj.sub();
//		
//
//	}
	
	public int sum (int x, int y) {
		//System.out.println(x+y);
		return x+y;
	}
	
	public int sub (int x, int y) {
		//System.out.println(x-y);
		return x-y;
		
	}
	
	public int div(int x, int y) {
		//System.out.println(x/y);
		return x/y;
		
	}
	
	public int mult(int x, int y) {
		//System.out.println(x*y);
		return x*y;
	}

}
