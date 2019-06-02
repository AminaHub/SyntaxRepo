package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	//How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		try {
		int num=scan.nextInt();
		}catch (InputMismatchException e) {
			//e.getMessage();
		System.out.println("Input Mismatch Exception");
		}
	}

}
