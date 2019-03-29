package com.Class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// Check if user has credit card -->
		//check what is the balance if balance is more than 1000--> pay off immediatly
		//else "you are good
		
		boolean creditCard=true;
		int balance = 1000;
		
		if (creditCard) {
			System.out.println("Lets check the balance");
			if (balance>=1000) {
				System.out.println("please pay off the balance now");
			}else{
				System.out.println("you are good");
			}
			
		}else {
			System.out.println("Do you want a credit card");
	}
		

	}

}
