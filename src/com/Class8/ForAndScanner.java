package com.Class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// Prompt user to enter 2 integers and compare
		//at the end print largest
		
		int num1;
		int num2;
		int largest=0;
		Scanner scan;
		
		for (int i = 1; i < 3; i++) {
			scan = new Scanner(System.in);
			System.out.println("Please enter two numbers");
			num1 = scan.nextInt();
			num2 = scan.nextInt();

			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + " is equal to " + num2);

			}
			System.out.println(largest + " is the largest");
		}

	}

}
