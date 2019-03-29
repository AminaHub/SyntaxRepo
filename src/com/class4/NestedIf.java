package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * write a program to check or eligibility
		 * if user is younger than <16 --> not allowed t work
		 * otherwise -->allowed to work. If user younger than 64--> go to work
		 * otherwise -->  enjoy your life
		 */
		int age = 65;
		int eligibleAge=16;
		int retirenmentAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young, no work for yuo");
		}else {
			System.out.println("You are eligible to work");
			if (age<retirenmentAge) {
				System.out.println("Go work hard");
			}else {
				System.out.println("Please enjoy your life, you don't need to work");
			}
		}
	}

}
