package com.class14_InterviewQuestions;

public class Task6 {

	public static void main(String[] args) {
		//6. Write a Java Program to find whether a String is palindrome or not? (dad, mom, heleh)
	
		String p ="Hannah";
		
		
		String pReverse="Hannah";
		if(p.equalsIgnoreCase(pReverse)) {
			System.out.println(p+" is a Palindrome word");
		}else {
			System.out.println(p+" is not a Palindrome word");
		}
		
		System.out.println();
		System.out.println("**************Another method**************");
		System.out.println();
		
		String pReverse1="";
		for(int i=p.length()-1; i>=0; i--) {
			pReverse1=pReverse1+p.charAt(i);
		}	
			System.out.println(pReverse1);
			if(p.equalsIgnoreCase(pReverse1)) { 
				
				System.out.println(p+" is a Palindrome word");
				
			}else {
				System.out.println(p+ " is not a Palindrome word");
			}
		
		
	}

}
