package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);//new ArithmeticException
		//if person is >18 years old --> issue driver license else -->we can throw an exception
		//checkAgeEligibility(17);
		//twoNumDiv(10,0);
		checkLength("A");
	}
	public static void checkAgeEligibility(int age) {
		if (age>=18) {
			System.out.println("Congratulation on your driver license");
		}else {
			throw new ArithmeticException ("You are not eligible to get driver license");
		}
		
		//create an exception: when user is trying to withdraw larger amount that the balance 
		//throw an exception saying "You do not have enough money"
	}
	
	public static void twoNumDiv(int a, int b) {
		if (b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We can't divide by zero");
		}
	}
	
	public static void checkLength(String userName) {
		if(userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("User name must be longer than 3 charectos");
		}
		
	}
}
