package com.class14;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 * 
		 * 
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many alpha characters are there in the String.
		 * 
		 * 
		 * You have a String a=“Is it saturday? Is it raining?
		 * Do we have a Java Class today?” 
		 * How would you find out how many sentences are in that String?
		 * 
		 * 
		 */
		String sentence="This is the first task of class14";
		String replaceAllSpaces= sentence.replaceAll("[^A-Za-z]", "");
		System.out.println(replaceAllSpaces);

		
		String aString="this is our 14 class @ Syntax";
		String newString=aString.replaceAll("[^A-Za-z]","");
		System.out.println(newString.length());
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] array=a.split("\\?");
		
		
		//System.out.println(array.length);
		
		
	}

}
