package com.class20;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a method createEmail().
		 * Based on provided users name, lastName and email type
		 * your method should return complete email address
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com
		 */
		Task obj=new Task();		
		System.out.println(obj.createEmail("john", "snow", "gmail"));
		System.out.println(obj.createEmail("john", "snow", "yahoo"));
		
		Task obj2=new Task();
		System.out.println(obj2.getGrade(30));
	}
	
	String createEmail(String name, String lastName, String emailType) {
		
		return name+lastName+"@"+emailType+".com";
		
		//or String email=name+lastName+"@"+emailType+".com";
		//return email.toLowerCase();
		
		
	}
	
	/* Create a class student that will have a method getGrade
	 * your method should accept a scor of a student and return a grade
	 * score >90 --> A
	 * score > 80 --> B
	 * score > 70 --> c
	 * score > 60 -->D
	 * anything else --> F
	 */ 
	 

	 char getGrade(int score){
		 char g=' ';
		 if (score >= 90) {
			 g='A';
		 }else if (score >= 80) {
			 g='B';
		 }else if (score >= 70) {
			 g='C';
		 }else if(score >= 60) {
			 g='D';
		 }else {
			 g='F';
		 }
		 
		 return g;
		 
	 }
}
