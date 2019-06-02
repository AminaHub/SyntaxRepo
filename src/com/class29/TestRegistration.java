package com.class29;

import java.util.Scanner;

public class TestRegistration {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a valid gmail address: ");
		String aEmail=scan.nextLine();
		
		User userA=new User();
		userA.setUserEmail(aEmail);
		
		//Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a valid user name: ");
		String aUserName=scan.nextLine();
		
		userA.setUserName(aUserName);

	}

}
