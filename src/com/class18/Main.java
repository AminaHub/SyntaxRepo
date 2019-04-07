package com.class18;

public class Main {

//	String name=new String();
//	int roll_no;
	
//	String carColor, carName;
//	int carModelYear;
	
	String bread, name, color;
	
	public static void main(String[] args) {

//repleit 76
//		Main m1=new Main();
//		
//		m1.name="John";
//		m1.roll_no=2;
//		
//
//		System.out.println("Name is "+m1.name+" and roll number is "+m1.roll_no);
//		
		
//		create a class named 'Main' with specific attributes.
//------------------------------------------------------------------------------------		
		
//repleit 77		
//		For you to do
//
//			Create two object in which you will be assigning the following values.
//			carColor='Black'
//			carModelYear=2019
//			carName='BMW'
//
//			carColor='White'
//			carModelYear=2018
//			carName='Toyota'
//
//			Car color is Black and car model year is 2019 and car name is BMW
//			Car color is White and car model year is 2018 and car name is Toyota
		
//		Main car1=new Main();
//		
//		car1.carColor="Black";
//		
//		car1.carModelYear=2019;
//		
//		car1.carName="BMW";
//		
//		
//		
//		Main car2=new Main();
//		
//		car2.carColor="White";
//		
//		car2.carModelYear=2018;
//		
//		car2.carName="Toyota";
//
//		System.out.println("Car color is "+car1.carColor +" and car model year is "+car1.carModelYear+" and car name is "+car1.carName);
//		System.out.println("Car color is "+car2.carColor +" and car model year is "+car2.carModelYear+" and car name is "+car2.carName);

//-----------------------------------------------------------------------------------------------------------
//repil78
		
//		Create a Class main that should be a template for the DogClass. 
//		In this class you should specify the following attributes: breed, name, color and following behaviors: bark(), run(), play().
//		Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
//
//		The output of the program should be as following:
//		 
//		Husky can bark
//		Husky can run
//		Husky can play
//		Bulldog can bark
//		Bulldog can run
//		Bulldog can play
//		Labrador can bark
//		Labrador can run
//		Labrador can play
//		
		
	Main dog1=new Main();
	dog1.bark("Husky");
	dog1.run("Husky");
	dog1.play("Husky");
	
	
	Main dog2=new Main();
	dog2.bark("Bulldog");
	dog2.run("Bulldog");
	dog2.play("Bulldog");
	
	
	Main dog3=new Main();
	dog3.bark("Labrador");
	dog3.run("Labrador");
	dog3.play("Labrador");
	
	
	
	}
	
	String bark(String b) {
		System.out.println(b+" can bark");
	return b;	
	}
	
	String run(String r) {
		System.out.println(r+" can bark");
	return r;	
	}
	
	String play(String p) {
		System.out.println(p+" can bark");
	return p;	
	}
	

}
