package com.class14;

import java.util.Scanner;

public class nterviewQuestion7 {

	public static void main(String[] args) {
		/*
		 *7. Write a java program to check whether a given number is prime or not? 
		 * 
		 * Prime number should meet 2 conditions: divisible by 1 & by itself ONLY
		 * 2,3,5,7,11,13,17,19,23,29
		 * 
		 */
		int number;
		boolean prime= true;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		
		
		for(int i=2; i<number; i++) {
			if(number % i != 0) {
				//System.out.println("prime");
			}else {
				prime=false;
				break;
			//System.out.println("not prime");
			}
		}
		System.out.println(prime);
		}
}
