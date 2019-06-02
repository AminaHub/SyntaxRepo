package com.class35;

public class ExceptionsReview {

	     //* Create a new class called ExceptionsReview, in it have the following methods     
		// void arithmetic(int a, int b) method to divide two integers for     
		// ArithmeticException Arithmetic error, such as divide-by-zero.     
		// Create another class called Test and create an object of the ExceptionsReview     
		// class and     *     * 1. call all the methods you created 2. handle all the exceptions using try     * catch finally blocks 3.

	void arrithmetic (int a, int b) {
		
		int c=a/b;
		System.out.println(c);
		
	}
	
	
	//void nullPointer() method to be able to throw NullPointerException Invalid    
	//* use of a null reference.
	void nullPointer () {
		String a=null;
		System.out.println(a.length());
		
	}

}
