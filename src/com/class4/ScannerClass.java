package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//take a number from a user and print that number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scanner.nextInt();
		System.out.println("You entered number "+num);
	}
}
