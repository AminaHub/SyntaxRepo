package com.Class17_2.copy;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Task6 obj=new Task6();
		
		obj.leapYear();
		
		
	}
	
	void leapYear () {
		
		/*
		 * 6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year. 
		 * As soon as the user enters the correct leap year exit the loop.
		 * 
		 * We add a Leap Day on February 29, almost every four years. The leap day is an extra, or intercalary, day and we add it to the shortest month of the year, February.

		 * In the Gregorian calendar three criteria must be taken into account to identify leap years:

		*  The year can be evenly divided by 4;
		*  If the year can be evenly divided by 100, it is NOT a leap year, unless;
		*  The year is also evenly divisible by 400. Then it is a leap year.
		*  This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, 
		*  while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years.

		 * Special Leap Year 2000
		 * 
		 * 
		 */
         int leapYear=0000;
         Scanner input=new Scanner(System.in);
                 
         for(int i=0; i<10; i++){
        	System.out.println("Please enter a leap year: "); 
        	leapYear=input.nextInt();
        	if(leapYear%4==0) {
        		if(leapYear%400==0) {
        			if (leapYear%100==0) {
        				System.out.println("This year is a leap year");
        				break;
        			}else {
        				System.out.println("this year is not a leap year");
        			}
        		}else {
        			System.out.println("This year is leap year.");
        			break;
        		}
        			
        	}else {
        		System.out.println("This year is not a leap year");
        	}
        }
         System.out.println("You can't try any more");
         
		
	}

}
