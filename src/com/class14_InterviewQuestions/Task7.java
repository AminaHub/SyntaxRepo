package com.class14_InterviewQuestions;

public class Task7 {

	public static void main(String[] args) {
		//  7.Write a java program to check whether a given number is prime or not?

		int a=9;
		boolean isPrime=false;
		for(int i=2; i<a; i++) {
			if(a%i==0) { 
				isPrime=true;
				break;	       
			}  
		}	
			if (!isPrime) {
            System.out.println(a+ " is a prime number.");
            
			}else {
            System.out.println(a + " is not a prime number.");
			}

		}	
	}
		


