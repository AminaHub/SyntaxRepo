package com.ForHomeworkAndPractice;

public class practice1 {

	public static void main(String[] args) {
		// Prepare a method taking an integer a  as  parameter and 
		//returns the sum of of digits of a. 
		//For instance, your number is 38 and the sum will be 3+8=11
		
		practice1 obj=new practice1();
		System.out.println(obj.sumOfDigits(23452871));

	}
	long sumOfDigits(int a) {
		int sumOfDigits = 0;
		char ch=' ';
		String s = String.valueOf(a);
		for(int i = 0; i < s.length(); i++)
		{
		 ch = s.charAt(i);
		 //System.out.println(ch);
		 sumOfDigits=sumOfDigits+Character.getNumericValue(ch);
		}
	return sumOfDigits;	
	}
}
