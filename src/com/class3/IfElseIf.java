package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
//		int num1=23;
//		int num2=14;
//		
//		if (num1>num2) {
//			System.out.println("I am if block");
//			System.out.println("I have multiple lines to print");
//			System.out.println("Num1 is larger than num2");
//		} else {
//			System.out.println("I am else block");
//			System.out.println("num1 is smaller than num2");
//		}

		int num1=23;
		int num2=23;
		
		if (num1>num2) {
			System.out.println("Num1 is larger than Num2");
		}else if (num1==num2){
			System.out.println("Num1 is equal to Num2");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
		
		System.out.println("I am outside the If/Else statement ");
		
		
	}

}
