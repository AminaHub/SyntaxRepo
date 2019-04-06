package com.Class17_2.copy;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Task5 obj=new Task5();
		/*
		 * 5.
		 * Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 * 
		 */
//		 Scanner input=new Scanner(System.in);
//	     System.out.println("Please enter a number between 1 and 20");
//	     int num=input.nextInt();
		
	   obj.guessingGame();
	     
	}

	void guessingGame () {
		
		/*
		 * 5.
		 * Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 * 
		 */
//		 Scanner input=new Scanner(System.in);
//	     System.out.println("Please enter a number between 1 and 20");
//	     int num=input.nextInt();
				
		int mysteryNum=15;
	     Scanner input=new Scanner(System.in);
        int num=0;
   	 do{
   		 
   	     System.out.println("Please enter a number between 1 and 20");
   	     num=input.nextInt();
   		 
   		 if (num>mysteryNum) {
   			 System.out.println("Your numer is Greater than the mystery number");
   	     }else if(num<mysteryNum) {
   	    	 System.out.println(" Your number is less than mystery number");
   	     }
        }while(num!=mysteryNum);
   	 
	    	 System.out.println("Congratulation! You got it!");
		
		
	}
}
