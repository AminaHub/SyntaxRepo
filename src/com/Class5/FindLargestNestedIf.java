package com.Class5;

import java.util.Scanner;

public class FindLargestNestedIf {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values
		 * Use nested if
		 * values are provided by the user
		 * numbers must be distinct
		 */
		double num1;
		double num2;
		double num3;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter decimal number 1: ");
		num1=scan.nextDouble();
		
		System.out.println("Please enter deicmal number 2: ");
		num2=scan.nextDouble();
		
		System.out.println("Please enter decimal number 3: ");
		num3=scan.nextDouble();
		
		if(num1>num2 || num1>num3 || num2>num1 || num2>num3 ||num3>num1 || num3>num2) {
			if(num1>num2 && num1>num2) {
				System.out.println(num1+" Num1 is the greatest");
			}else if(num2>num1 && num2>num3) {
				System.out.println(num2+" Num2 is the greatest");
			}else if(num3>num1 && num3>num2) {
				System.out.println(num3+" Num3 is the greatest");
			}
		  
	   }else {
			System.out.println("there is no largest number among these numbers");
	   }

	}

}
