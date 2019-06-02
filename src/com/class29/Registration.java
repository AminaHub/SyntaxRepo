package com.class29;


//3. Create Registration Class in which you would have variables as email, 
//userName and password that have an access scope only within its own class. 
//After creating an object of the class user should be able to call methods and in each method separately 
//pass values to set users email, username and password.
//Requirements:Valid email consider to be only gmailValid userName and password cannot be empty 
//and should be of length larger than 6 characters. Also valid password cannot contain userName.

import java.util.Scanner;

public abstract class Registration {
	String email;
	String userName;
	String password;
	
	
	
	public abstract void setUserEmail(String email);
	public abstract void setUserName(String userName);
	//public abstract void setUserPassword(String password);
	

}

class User extends Registration{
	
	@Override
	public void setUserEmail(String aEmail) {
		boolean emailValid=aEmail.contains("gmail");
		
		if(emailValid==false) {
			System.out.println("please enter a vaild gmail address");
		}else {
			System.out.println("Email has been reset");
		}
		
	}
	
	@Override
	public void setUserName(String userName) {
	
		boolean userEmpty=userName.isEmpty();
		//boolean passEmpty=password.isEmpty();
		//boolean passContain=password.contains(userName);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a valid user name: ");
		String aUserName=scan.nextLine();
		
		if (userEmpty==true) {
			System.out.println(" User name cann't be empty.");
			//System.out.println("Please enter a valid user name: ");
			//aUserName=scan.nextLine();
			
		}else {
			System.out.println("User Name has been reset");
			
		}
	}	
		
//		int lengthPass=password.length();
//		
//		if(!(userEmpty || passEmpty)) {
//			
//			if(lengthPass>8) {
//				
//				if(!(passContain)) {
//					if(password.contentEquals(confirmPassword)) {
//						System.out.println("account created");
//					}else {
//						System.out.println("passwords do not match");
//					}
//					
//				}else {
//					System.out.println("Pass word cannot contain user name");
//				}
//				
//			}else {
//				System.out.println("Password must be more than 8 char");
//			}
//			
//		}else {
//			System.out.println("User and Password must be entered");
//		}
//			
//		
//		
//	}
//	
//	
//
//	
//	@Override
//	public void setUserPassword() {
//
//		boolean passEmpty=password.isEmpty();
//		boolean passContain=password.contains(userName);
//		
//	}
//	
	

}

