package com.class15;

import java.util.Scanner;

public class InterviewQuestion6 {

	public static void main(String[] args) {
		/*
		 * 6. Write a Java Program to find whether a String is palindrome or not? (dad, mom, heleh)
		 * 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter any word to check if it is a Palidrme!");
		String word=scan.nextLine();
		
		String reverse="";
		for(int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);	
		}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidorme ");
		}else {
			System.out.println("The word is not a palidorme");
		}
	}

}
