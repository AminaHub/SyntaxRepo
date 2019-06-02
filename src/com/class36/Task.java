package com.class36;

public class Task {

	public static void main(String[] args) {
		//create an exception: when user is trying to withdraw larger amount that the balance 
		//throw an exception saying "You do not have enough money"
		
		withdraw(500, 600);

	}
	
	public static void withdraw(double balance, double amount) {
		
		
		if (amount<=balance) {
			System.out.println("Please take your money");
		}else {
			throw new ArithmeticException ("You do not have enough money");
		}
		
		
	}

}
