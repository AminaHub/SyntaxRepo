package com.class14_InterviewQuestions;

public class Task5 {

	public static void main(String[] args) {
		// 5. Write a java program to reverse String? Reverse a string word by word?
		
		String anyStr="It was a nice weather today";
		

		String[] array=anyStr.split(" ");
		String reverse="";
		String reverseStr="";
		
	for(int i=array.length-1;i>=0;i--) {  
		System.out.print(array[i]+" ");
	}

		System.out.println();
		
		System.out.println("Reverse word by word");
		System.out.println("");
		for (int i = 0; i < array.length; i++)
        {         			
			String  strWord= array[i]; 
          
           for (int j = strWord.length()-1; j >=0; j--) {
        	   reverse = reverse+ strWord.charAt(j);
           }
           
           reverse= reverse+" " ;
           
       }
		reverseStr = reverseStr + reverse;
	System.out.println(reverseStr);
   }
	}


