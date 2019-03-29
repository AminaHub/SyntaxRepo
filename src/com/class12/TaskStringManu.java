package com.class12;

import java.util.Scanner;

public class TaskStringManu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your User Name");
		String userName=scan.nextLine();
		
		System.out.println("Please enter your Password");
		String password=scan.nextLine();
		
		System.out.println("Please confirm Password");
		String confirmPassword=scan.nextLine();
		
		int lengthPass=password.length();
		
//		System.out.println(userName);
//		System.out.println(password);
//		System.out.println(confirmPassword);
		
		boolean userEmpty=userName.isEmpty();
		boolean passEmpty=password.isEmpty();
		boolean passContain=password.contains(userName);
		
		if(!(userEmpty || passEmpty)) {
			
			if(lengthPass>8) {
				
				if(!(passContain)) {
					if(password.contentEquals(confirmPassword)) {
						System.out.println("account created");
					}else {
						System.out.println("passwords do not match");
					}
					
				}else {
					System.out.println("Pass word cannot contain user name");
				}
				
			}else {
				System.out.println("Password must be more than 8 char");
			}
			
		}else {
			System.out.println("User and Password must be entered");
		}
			
		
	}

}
