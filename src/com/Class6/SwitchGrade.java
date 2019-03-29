package com.Class6;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, d-Bad,
		 * and other grade __> not Acceptable.
		 * At the end of your program should print which grade was entered by user with explanation
		 */

		char grade;
		String explain="";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		grade=input.next().charAt(0);
		
		switch (grade){
		
		case 'A':
			explain="Excellent";
			break;
		case 'B':
			explain="Good";
			break;
		case 'C':
			explain="Average";
			break;
		case 'D':
			explain="Bad";
			break;
			
		default:
			explain="Not accptable";
		}
		System.out.println("Your grade is "+explain);
		
		
	}
	
}
