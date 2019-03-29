package com.Class5;

import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		/*
		*Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following:
		* short (under 5 feet)
		* medium(5 to 6 feet)
		* tall (6 feet and over)
		*/	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter one person's height:");
		double height1=scan.nextDouble();
		//System.out.println("Please enter another person's height");
		//int height2=scan.nextInt();
		
		if (height1<5) {
			System.out.println("Short");
			
		}else if (height1>=5 && height1<6) {
			System.out.println("Medium");
		}else if (height1 >=6){
			System.out.println("Tall");
		}else {
			System.out.println("Please enter valid heights");
		}
	}

}
