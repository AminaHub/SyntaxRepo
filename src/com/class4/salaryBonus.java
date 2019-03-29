package com.class4;

import java.util.Scanner;

public class salaryBonus {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 * otherwise bonus=3000.
		 */
		
		int numYears;
		
		
		Scanner myYearsBonus=new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		
		numYears=myYearsBonus.nextInt();
		
		System.out.println("Please enter your annual salary");
		
		
		int salary;
		
		salary=myYearsBonus.nextInt();
		if(numYears>=5) {
			System.out.println("User eligible for bonus");
			if (salary>=50000) {
				System.out.println("User's bonus 5000");
			}else {
				System.out.println("User's bonus 3000");
			}
		}else {
			System.out.println("User is ot eligible for bonus");
		}
			
	}

}
