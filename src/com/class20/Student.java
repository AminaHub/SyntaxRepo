package com.class20;

public class Student {

	public static void main(String[] args) {
		/* Create a class student that will have a method getGrade
		 * your method should accept a scor of a student and return a grade
		 * score >90 --> A
		 * score > 80 --> B
		 * score > 70 --> c
		 * score > 60 -->D
		 * anything else --> F
		 */ 
		Student stu=new Student();
		char myGrade=stu.getGrade(30);
		System.out.println("My grade at Syntax "+ myGrade);
		


	}
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
