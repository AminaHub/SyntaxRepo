package com.ReviewSession;

import java.util.Scanner;

public class ClassThree {

	public static void main(String[] args) {

		 // Write a program to find out what to do for the following temperatures
                // Temperatures is greater than 100 print out Stay inside it's too hot
                // temperatures is greater than 50 and less than 99 print out Wear winter clothes
                // temperatures is greater than 30 and less than 49 print out Wear winter clothes
                // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
                // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		 

//		int temp=100   ;
//		if(temp>= 100) {
//			System.out.println("Please stay inside it is too hot");
//		}else if(temp>=50 && temp<=90) {
//			System.out.println("Wear Summer clothes");
//		}else if(temp>=30 && temp<=49) {
//			System.out.println("Wear winter clothes");
//		}else if(temp>=10 && temp<=29) {
//			System.out.println("Stay inside it is too cold");
//		}else {
//			System.out.println("Call for help. It is too cold outside");
//		}
		
		
		
		//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 90 inclusive print out  You are Middle Age Person
        // If the age is greater than 100 print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		
//		int age=0;
//				
//		Scanner input=new Scanner(System.in);
//		System.out.println("Please inter your age");
//		
//		age=input.nextInt();
//		
//		if (!(age>18)){
//			System.out.println("You are too young");
//		}else if(age>18 && age<=35) {
//			System.out.println("Young Person");
//		}else if (age==36 || age <=90) {
//			System.out.println("You are middle age person");
//		}else {
//			System.out.println("You are too old");
//		}
		
//		int day;
//		String dayOfWeek;
//		Scanner input;
//		
//		input=new Scanner(System.in);
//		System.out.println("Please enter number of the day");
//		
//		day=input.nextInt();
//		
//		switch (day) {
//		
//		case 1: 
//			dayOfWeek="Monday";
//			break;
//		case 2: 
//			dayOfWeek="Tuesday";
//			break;
//		case 3: 
//			dayOfWeek="Wednesday";
//			break;
//		case 4: 
//			dayOfWeek="Thursday";
//			break;
//		case 5: 
//			dayOfWeek="Friday";
//			break;
//		case 6: 
//			dayOfWeek="Saturday";
//			break;
//		case 7: 
//			dayOfWeek="Sunday";
//			break;	
//		default:
//			dayOfWeek="Invalid";
//			break;
//		}
//		System.out.println("The day of the week is "+dayOfWeek);
		
		
		
		
		// Write a program to found out the user level of experience
        // Must use a switch statement with  a String variable named levelString and a int variable named level
        
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
		
//		int level;
//		
//		String nameLevel;
//		Scanner input=new Scanner(System.in);
//		
//		System.out.println("Please enter a level number (between 1 and 3)");
//		
//		level=input.nextInt();
//		
//		switch (level) {
//		
//		case 1:
//			nameLevel="Beginner";
//			break;
//		case 2:
//			nameLevel="Intermediate";
//			break;
//		case 3:
//			nameLevel="Expert";
//			break;
//		default:
//			nameLevel="Invalid Level";
//			break;	
//		
//		}
//		System.out.println("Your level is "+nameLevel);
		
		//Teacher's solution
		
		String levelString="Expert";
		int level=0;
		switch(levelString) {
		case "Beginner":
		level=1;
		break;
		
		case "Intermediate":
			level=2;
			break;
			
		case "Expert":
			level=1;
			break;	
			
		default:
			level=0;
			break;	
		
		}
		System.out.println("Level is "+level);
	}

}
