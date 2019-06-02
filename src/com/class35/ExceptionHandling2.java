package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begining of the code");
		int a=10;
		int b=10;
		
		try {			
			System.out.println(a/b);
			System.out.println("Code iside try block");
			
		}catch (ArithmeticException e) {
			System.out.println("Code inside catch block");
		}
		
		System.out.println("end of the code");
	}

}
