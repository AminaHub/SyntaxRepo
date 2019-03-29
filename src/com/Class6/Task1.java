package com.Class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 
		*Write a program that prints out if it is good weather to go for any activity or not
		* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
		* otherwise--> we will not go hiking
		* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		* we are not going snowboarding
		* it if temperature is more than 80 & sunny--> go to the beach
		* otherwise --> not go to the beach
		* 
		* First check temp
		* if temp(>40 <=80){
		*   check if it is raining -->
		*   if (raining){
		*      activity=watch movie;
		*   }else{
		*     activity=go hiking;
		*   }
		*   
		* } else if (temp>=25 temp <40){
		*    if (snowing){
		*      activity=snow boarding;
		*    }else{
		*     activity= do coding;
		*      
		*    }
		* }else if (temp>80){
		* 
		* 	if (sunny){
		*     activity=go to the beach;
		*   }else{
		*    activity=more coding;
		*   }
		* }else{
		*   System"Please enter different temp";
		* }       
		* }             
		 */

		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity="";
		
		scan=new Scanner(System.in);
		System.out.println("please enter temprature");
		temp=scan.nextInt();
		
		//System.out.println("please enter if it is Raining");
		
		//rain=scan.nextBoolean();
		//sunny=scan.nextBoolean();
		//snow=scan.hasNextBoolean();
		
		//System.out.println("please enter weather");
		
		if (temp>=40 && temp<80) {
			System.out.println("Is it Raining");
			rain=scan.nextBoolean();
			if(rain) {
				activity="Watch a movie";
			}else {
				activity="Go Hiking";
			}
			//System.out.println(activity);
		}else if(temp>=25 && temp<40 ) {
			System.out.println("Is it snowing");
			snow=scan.nextBoolean();
			if(snow) {
				activity="Go Snow Boarding";
			}else {
				activity="Do coding";
			}
			//System.out.println(activity);
		}else if(temp>=80) {
			System.out.println("Is it Sunny");
			sunny=scan.nextBoolean();
			if(sunny) {
				activity="Go to the beach";
				//System.out.println("Activity is "+activity);
			}else {
				activity="Do more coding";
			}
		}else {
			System.out.println("Please enter different temperature");
			activity="Unknown";
		  }	
	  System.out.println("My activity for today is "+activity);		
			
			
			

		
	}

}
