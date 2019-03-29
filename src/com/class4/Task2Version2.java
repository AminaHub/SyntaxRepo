package com.class4;

public class Task2Version2 {
	public static void main(String [] args) {
		double mortgageRate= 4.3;
		int mortgagePrice=200000;
		
		if (mortgageRate<4.5) {
			System.out.println("I will consider buying a house");
			if (mortgagePrice<=200000) {
				System.out.println("User will pay cash");
			}else {
				System.out.println("User will pay loan");
			} 
		}else {
				System.out.println("I will not buy that house");
		}
	}
}
