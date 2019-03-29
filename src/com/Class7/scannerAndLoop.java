package com.Class7;

import java.util.Scanner;

public class scannerAndLoop {

	public static void main(String[] args) {
		/*Prompt user to ask the name 3 times and print"You are doing great______"*/
		
		Scanner scan;
		String name;
				
		scan=new Scanner(System.in);
		int a=1;
		
		while (a<=3) {
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("You are doing great "+name);
			
			a++;
		}
		
		
	//ask user to pay for soda
	//keep asking user to pay for soda until entered price is not equal to 1.99
	//after user got a write amount print "Please enjoy your soda
		
		
		
		

	}

}
