package com.class29;

//2. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and 
//in four subjects (each out of 100) by student B. 
//Create class ‘Marks’ with an abstract method ‘getPercentage’. 
//It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns 
//the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its parameters and the marks in 
//four subjects as its parameters for student B. Test your code

public abstract class Marks {
	public abstract void getPercentage();

}

class StudentA extends Marks{
	StudentA(int a, int b, int c){
		int avg=0;
		avg=(a+b+c)/3;
	}
	

	@Override
	public void getPercentage() {
		//int avg=0;
		//avg=(a1+b1+c1)/3;
		System.out.println(this.avg);
		
		
	}
}
