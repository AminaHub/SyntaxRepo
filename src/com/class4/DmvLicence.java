package com.class4;

import java.util.Scanner;

public class DmvLicence {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age.
		 * f they are 18 and older you will issue a driver licence to hem
		 * otherwise you will offer them to get a learners permit
		 */
		int age;
		
		Scanner dmvScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		age=dmvScanner.nextInt();
		if (age>=18){
			System.out.println("Drivers licence approved");
		}else {
			System.out.println("We will issue a learners permit because you are less than 18 years old");
			
		}
	}

}
