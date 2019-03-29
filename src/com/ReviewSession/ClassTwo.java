package com.ReviewSession;

import java.util.Scanner;

public class ClassTwo {

	public static void main(String[] args) {
//		int x=10;
//		int y=5;
//		
//		if (x>y) {
//			
//			System.out.println("x is greater than y");
//		}
		
		// if else statement
		//Write a program to find if a number is even or odd
		//Print out "My number must be even" or "My number must e odd"
		//Must use if else
		
//		int a = 15;
//		
//		if (a%2 == 0) {
//			System.out.println(a+" is an even number");
//		}else {
//			System.out.println(a+ " is an odd number");
//		}
		
		
		//Time of the day
		//int time=0022;
		//if (Time>=0700){
		//System.out.println("Good Morning");
		//}else if(time<=1202){
		//System.out.println("Good day");
		//}else {
		//System.out.println("Good evening");
		//}	

		//Summer vacation and sunny beach
//		boolean summer=true;
//		boolean sunny=false;
//		
//		if (summer==true) {
//			
//			if (sunny==true) {
//				
//				System.out.println("we are going to the beach because it is sunny");
//				
//			}else {
//				System.out.println("we are not going to the beach because it is couldy today");
//			}
//	
//	}
//		
//	else {
//			
//			System.out.println("we are not going on vacation");
//			
//		}
		
		
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("please enter your name:");
		
		String name=input.nextLine();
		
		//System.out.println("Name: "+name);
		
		System.out.println("Please enter you gender:");
		
		String gender=input.nextLine();
		
		//System.out.println("Gender: "+gender); 
		
		System.out.println("Please enter yuor age" );
		
		int age=input.nextInt();
		
		//System.out.println("age: "+age);
		
		System.out.println("Please enter your telephone number:");
		
		long mobileNo=input.nextLong();
		
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender); 
		System.out.println("age: "+age);
		System.out.println("Mobile Number: "+mobileNo);
		
		
	
		
		
		
	}

}
