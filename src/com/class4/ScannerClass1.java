package com.class4;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		// ask user for the name and print Good Morning__
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please nter your name");
		String name=input.nextLine();
		System.out.println("Good morning "+name);

	}

}
