package com.Class6;

import java.util.Scanner;

public class SwitchLanguage {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 */
		String country;
		String language="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country ");
		
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Iraq":
			language="Arabic";
			break;
		case "Italy":
			language="Italian";
			break;	
		case "France":
			language="French";
			break;	
		case "Spain":
			language="Spanish";
			break;	
		case "England":
			language="English";
			break;	
		case "Canada":
			language="English or/and French";
			break;	
		case "Russia":
			language="Russian";
			break;	
		case "Pakistan":
			language="Urdu";
			break;	
		case "India":
			language="Hendi and Urdu";
			break;	
		default:
			language="Unknown";
		    break;
		
		
	}
		System.out.println("Your language is "+language);
	}

}
