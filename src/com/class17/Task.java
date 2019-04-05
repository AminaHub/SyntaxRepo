package com.class17;

public class Task {

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		//Create a method that will take a number and prints whether the number is even or odd.
		//Create a method that will print whether given String is palindrome or not.
		
		Task t=new Task();
		
		t.larger(5, 10);
		t.evenOrOdd(16);
		t.palindrome("dada");
	}	
	
	
		void larger(int a, int b){
			
			if (a>b) {
				System.out.println(a+" is larger than "+b);
			}else {
				System.out.println(a+" is smaller than "+b);
			}
			
		}
		
		void evenOrOdd(int a) {
			if (a%2==0) {
				System.out.println(a+" is an even number");
			}else {
				System.out.println(a+" is an odd number ");
			}
		}
	  
		void palindrome(String str) {
			String reverse="";
			for(int i=str.length()-1; i>=0; i--) {
				reverse+=str.charAt(i);	
			}
			if(str.equalsIgnoreCase(reverse)) {
				System.out.println(str+" is palindorme ");
			}else {
				System.out.println(str+" is not a palindorme");
			}
		}

}
