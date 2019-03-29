package com.Class5;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values
		 * Use if-else..is
		 * values are provided by the user
		 * numbers must be distinct
		 */
		
		double num1;
		double num2;
		double num3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please inter decimal number 1:");
		num1=scan.nextDouble();
		
		System.out.println("Please enter decimal number 2: ");
		num2=scan.nextDouble();
		
		System.out.println("Please enter decimal number 3: ");
		num3=scan.nextDouble();
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest number");
		}else if(num2>num1 && num2>num3 ) {
			System.out.println(num2+" is the largest number");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest number");
		}else {
			System.out.println("Non of the numbers is largest");
		}
	}

}
