package com.class14;

public class GroupExercise {

	public static void main(String[] args) {
		/*
		 * 
		 * 1.Write a program to swap 2 numbers without a temporary variable? 
		 * Swap 2 strings without a temporary variable?
		 * 2.Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 * 3. Find out how many alpha characters present in a string?
		 * 4.How to find out the part of the string from a string? What is substring? 
		 * Find number of words in string?
		 * 5. Write a java program to reverse String? Reverse a string word by word?
		 * 
		 */
 //1-
		int a = 8; 
        int b = 4; 
        
//        a = a + b; //a=8+4= 12
//        b = a - b; //b=12-4= 8
//        a = a - b; //a=12-8= 4
        //int intValAbs = Math.abs(intVal);
        
       
        //b=Math.abs((a+b)-a);
        
        System.out.println("After swaping:"
                           + " a = " + a + ", b = " + b); 
        
        
        int x = 8, y = 18; 
        x = x ^ y ^ (y = x);  
        System.out.println(x +" "+y);
        
        String s ="first";
        String s2 ="second";
        
        s=s+s2;//first+second=firstsecond  s=firstsecond
        s2=s.substring(0,s.length()-s2.length());//s2=firstSecond-Second=First s2=First
        s=s.substring(s2.length());//FirstSecond.substring(first)=Second  s=Second
        
        
        System.out.println("After swaping:"
                + " s = " + s + ", s2 = " + s2); 
        
  //2.
        
        int[] arr= {144,46,0,6,292,-1};
        
        int h=0;
        int h2=0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]>h) {
        		h2=h;
        		h=arr[i];
        		        	        		
        	}else if(arr[i]>h2) {
        			h2=arr[i];
        		}
      
      }
        System.out.println("The second highest number is  "+h2);
        
        int max=arr[0];
        int min=arr[0];
        
        for(int j=0; j<arr.length; j++) {
        	if(arr[j]>max) {
        		max=arr[j];
        	}else if(arr[j]<min) {
        		min=arr[j];
        	}
        
        }
        
       System.out.println("The max number is  "+max+" the min number is "+min);
        
    
	
	
	//3.
	
	
	String sentence2="This is number 3 question";
	String many= sentence2.replaceAll("[^A-Za-z]", "");
	System.out.println(many.length());
	
	
	/*
	 * 6. Write a Java Program to find whether a String is palindrome or not? (dad, mom, heleh)
	 * 7. Write a java program to check whether a given number is prime or not?
	 * 8. Write a Java Program to print first 10 numbers of Fibonacci series.
	 * 
	 * 
	
	 */

}

}
