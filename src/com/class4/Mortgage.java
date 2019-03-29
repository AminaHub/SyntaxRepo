package com.class4;

public class Mortgage {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store variables to store mortgage rate and mortgage price. 
		 * First program should check if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying. 
		 * Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash.
		 */
		
		double mortgageRate=4.5;
		int mortgagePrice=300000;
		
		if (mortgageRate>=4.5) {
			System.out.println("I am NOT buying a house");
		}else {
			System.out.println("I will consider buying the House");
			if (mortgagePrice>=200000) {
				System.out.println("User will take a loan");
			}else {
				System.out.println("User will pay cash");
			}
			
		}

	}

}
