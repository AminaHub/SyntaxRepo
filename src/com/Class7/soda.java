package com.Class7;

import java.util.Scanner;

public class soda {

	public static void main(String[] args) {
		//ask user to pay for soda
		//keep asking user to pay for soda until entered price is not equal to 1.99
		//after user got a right amount print "Please enjoy your soda
		
		
		double price= 0.00;
		
		Scanner scan;
		
		scan = new Scanner(System.in);

		
		while (price != 1.99){
			//System.out.println("Please enter correct soda amount");
			if (price == 1.99) {
				System.out.println("Enjoy your soda");
			}else {
				System.out.println("Please enter correct soda amount");
			}
			
			price++;
			
			
		}

	}

}
