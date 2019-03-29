package com.Class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/)
		 * Based on operator provide the result to user
		 */
		int num1;
		int num2;
		char operator;
		int result;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter two numbers and an arethmatic operator");
		num1= input.nextInt();
		num2= input.nextInt();
		operator=input.next().charAt(0);
		
		
		
		switch (operator) {
		
		case '+':
			result=(num1+num2);
			break;
			
		case '-':	
			result=(num1-num2);
			break;
			
		case '*':
			result=(num1*num2);
			break;
			
		case '/':
			result=(num1/num2);
			break;
			
		default:
			result=0;
			break;
			
			
		}
	System.out.println("The result of "+num1+" "+operator+" "+num2+" is "+result);	
	}

}
