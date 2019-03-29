package com.class4;

import java.util.Scanner;

public class CityAndTemprature {

	public static void main(String[] args) {
		/*
		 * As user to enter city and temperature n Fahrenheit
		 * Your program should convert F-->C
		 * Your program should say "The Temperature in he city ----is---"
		 */
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please nter you city");
		cityName=myScanner.nextLine();
		System.out.println("Please enter temperature n Fahrenheit");
		temp=myScanner.nextInt();
		//Formula (F-32)*5/9;
		
		int convertTemp=(temp-32)*5/9;
		System.out.println("The emprature in the city "+cityName+" is "+convertTemp+" C");
	}

}
