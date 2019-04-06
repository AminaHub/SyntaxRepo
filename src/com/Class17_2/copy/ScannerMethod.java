package com.Class17_2.copy;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj = new ScannerMethod();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two integers: ");
		
		int a= scan.nextInt();
		int b = scan.nextInt();
		System.out.println("The sum of the two integers is: ");
		obj.sum(a, b);
		
		//obj.sum(12, 13);
		//obj.sm(100,100);
		
		//obj.sub();
		//obj.sub();
		

	}
	
	int sum (int x, int y) {
		
		System.out.println(x+y);
		return x+y;
	}
	
	void sub (int x, int y) {
		
		int a=10, b=12;
		System.out.println(a-b);
		
	}

}
