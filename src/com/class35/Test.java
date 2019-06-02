package com.class35;

public class Test {

    //* Create a new class called ExceptionsReview, in it have the following methods     
	// void arithmetic(int a, int b) method to divide two integers for     
	// ArithmeticException Arithmetic error, such as divide-by-zero.     
	// Create another class called Test and create an object of the ExceptionsReview     
	// class and    
	//1. call all the methods you created 
	//2. handle all the exceptions using try     * catch finally blocks 3.

	public static void main(String[] args) {
		
		ExceptionsReview obj = new ExceptionsReview();
		
//		try {
//		obj.arrithmetic(5, 0);
//		}catch (ArithmeticException ae){
//			System.out.println("invalid operation");
//			System.out.println(ae.getMessage());
//			
//		}catch(Exception e) {
//			//in case ArithmeticException doesnot catchthe exception
//		}finally {
//			System.out.println("Finally block");
//		}
		
		try {		
			obj.nullPointer();
		}catch (NullPointerException e)	{
			System.out.println(e.getMessage());
		}finally {
		System.out.println("Finally block");
		}

	}

}
