package com.class14_InterviewQuestions;

public class Task4 {

	public static void main(String[] args) {
		//4.How to find out the part of the string from a string? What is substring? 
		 //Find number of words in string?
		
		String anyStr="It was a nice weather today";
		
		System.out.println(anyStr.substring(10));
		
		System.out.println(anyStr.substring(3,21));
		
			
		String [] array=anyStr.split(" ");
		System.out.println(array.length);
		
		
		
		       
	}

}
