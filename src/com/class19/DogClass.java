package com.class19;

public class DogClass {
	 String color,breed,name;                 
	 public static void main(String[] args) {                
		 DogClass dog1=new DogClass();                
		 dog1.breed="Wild";                
		 dog1.color="Brown";                
		 dog1.name="Husky";                 //                
		 dog1.bark();                
		 dog1.run();                
		 dog1.play();                //                
		 DogClass dog2=new DogClass();               
		 dog2.breed="Wild";                
		 dog2.color="Yallow";                
		 dog2.name="Bulldog";                //               
		 dog2.bark();                
		 dog2.run();               
		 dog2.play();                //                
		 DogClass dog3=new DogClass();                
		 dog3.breed="wild";                
		 dog3.color="white";                
		 dog3.name="Labrador";                //                
		 dog3.bark();                
		 dog3.run();                
		 dog3.play();           
		 }            
	 void bark() {                
		 System.out.println("Husky can bark");           
	 }            
	 void run() {                
		 System.out.println("Bulldog can run");            
	 }            
	 void play() {                
		 System.out.println("Labrador can play");           
	 }                       
}


