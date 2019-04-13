package com.class22;

public class Students {
	public String studentName=" ";
	public int avg;
	
	
	Students(String name){
		studentName=name;
		System.out.println(studentName);
		
		
	}
	public int avgGrade(int g1, int g2, int g3) {
		//int avg=0;
		avg=(g1+g2+g3)/3;
		System.out.println("Your avrage grade is "+avg);
		return avg;
	}
	
	

}
