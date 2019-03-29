package com.Class8;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// let user define a range of numbers to print
		
		Scanner scan;
		int sum=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("Please enter ending number");
		int endNumber=scan.nextInt();
		
		for(int i=startNumber; i<=endNumber; i++) {
			
			sum=startNumber+i;
			
			
		}
		System.out.println("The sum of the two numbers you entered is "+sum);
		

	}

}
