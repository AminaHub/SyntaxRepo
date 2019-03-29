package com.Class5;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		*if the average score >=90 =>grade=A
		*if the average score >= 70 and <90 => grade=B
		*if the average score>=50 and <70 =>grade=C
		*if the average score<50 =>grade=F
		*/
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter quiz grade:");
	int quiz=input.nextInt();
	
	System.out.println("Please enter mid term grade:");
	int mid=input.nextInt();
	
	System.out.println("Please enter final grade grade:");
	int final1=input.nextInt();
	
	int ave=(quiz+mid+final1)/3;
	
	System.out.println("Average score is "+ave);
	
	if (ave>=90) {
		System.out.println("Grade is A");
	}else if(ave>=70 && ave<90) {
		System.out.println("Grade is B");
	}else if (ave>=50 && ave<70) {
		System.out.println("Grade is C");
	}else if (ave<50) {
		System.out.println("Grade is F");
	}else {
		System.out.println("you are expeled from the class");
	}
	
	
	}

}
