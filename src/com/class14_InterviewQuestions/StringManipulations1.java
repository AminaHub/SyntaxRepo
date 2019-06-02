package com.class14_InterviewQuestions;

public class StringManipulations1 {

	public static void main(String[] args) {
		// toCharArray()-converts starting to array of charactors
		
		String str="saturday";
		
		char[] array=str.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//using for each loop
		for(char c: array) {
			System.out.println(c);
		}
		
		System.out.println("Printing in reverse");
		for(int i=array.length-1;i>=0;i--) {  //i=array.length-1 we use -1 because we need the index and not the length of the string
			System.out.println(array[i]);
		}

	}

}
