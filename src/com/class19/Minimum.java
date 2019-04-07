package com.class19;

public class Minimum {
	
	//Create a class called Minimum
	//within it create a method called minOfValues
	//make it static
	//From your previous Applicataions class call the method and pass an array argument
	//and print out the result
	
	//{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	//int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	static int minOfValues(int [] x) {
		int min = x[0];
		for (int y:x) {
			if(y<min) {
				min=y;
			}
		
		}
		
		return min;
	}

	static int maxOfValues(int[] y) {
		
		// Write a program to find the maximum and minimum value of an array.       
		// int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };      
		
		int max = y[0];        
		//int min = y[0];       
		for (int j = 0; j < y.length; j++) {           
			if (y[j] >= max) {    
				max = y[j];     
			}        
//			if (y[j] <= min) {       
//				min = y[j];           
//			}        
		}
		return max;
				
	}
	void print() {
		int my_array[] = {-1,2,3,4,-2,6,50,8,9,10};
		int[] array= {25,14,56,15,36,56,77,18,29,49};
		System.out.println("Printing the minimum value of the array ");
		System.out.println(Minimum.minOfValues(my_array));
		
		System.out.println("Printing the maximum value of the array ");
		System.out.println(Minimum.maxOfValues(array));
		
	}
}
