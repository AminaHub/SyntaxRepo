package com.class13;

import java.util.Scanner;

public class Task {
     public static void main(String[] args) {
    	 //Create a String and print it in reverse order (Sunday --> yadnuS)
    	 
    	 //Create a String and if the String is not empty perform the following: 
    	 //if the String has an odd number of characters and has 3 or more characters, print
    	 //the character in the middle of the string.
    	 
    	 String day = "Sunday";
    	 
    	 for(int i=day.length()-1; i>=0; i--) {
 			System.out.print(day.charAt(i));
 		}
    	 
    	 //teacher's solution
    	 
    	//Create a String and if the String is not empty perform the following: 
    	 //if the String has an odd number of characters and has 3 or more characters, print
    	 //the character in the middle of the string.
    	 
    	 
    	String day1=new String("Thursday!");
    	
    	if(!day1.isEmpty()) {
    		if(day1.length()%2!=0 && day1.length()>=3) {
    			System.out.println(day1.charAt(day1.length()/2));
    		}
    	}
    	 
 		/*
 		 *Create a String and print it in reverse order (Sunday → yadnuS).
 		 *Create a String and if the String is not empty perform the following: 
 		 *if the String has an odd number of characters and has 3 or more characters, 
 		 *print the character in the middle of the String 
 		 * 
 		 * 
 		 * 
 		 */
    	
    	/*
    	 * 
    	 * 
    	 * 
    	 */
    	
    	Scanner scan;
    	String motherName="";
    	String fatherName="";
    	String gender="";
    	String babyName="";
    	
    	scan=new Scanner(System.in);
    	System.out.println("Please enter mothers name ");
    	motherName=scan.nextLine();
    	System.out.println("Please enter fathers name");
    	fatherName=scan.nextLine();
    	System.out.println("Please enter expected gender");
    	gender=scan.nextLine();
    	
    	if(gender.equalsIgnoreCase("boy")) {
    		babyName=fatherName.substring(0, fatherName.length()/2)+
    				motherName.substring(motherName.length()/2);
    	}else if(gender.equalsIgnoreCase("girl")) {
    		babyName=motherName.substring(0, motherName.length()/2)+
    				fatherName.substring(fatherName.length()/2);
    	}else {
    		babyName="No suggetion";
    	}
    	System.out.println(babyName.toUpperCase());
     	
    	}
    			
   	
   
     
}
