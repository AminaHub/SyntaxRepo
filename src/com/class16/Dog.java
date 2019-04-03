package com.class16;

public class Dog {
	
	String size, bread, color;
	boolean bark, sleep;
public static void main(String[] args) {
		
		Dog d1=new Dog();
		d1.bread="Huskie";
		d1.bread="Lab";
		d1.color="Gold";
		d1.bark=true;
		d1.sleep=true;
		
		d1.walk();
		d1.play();
		
		
//		Phone ph2=new Phone();
//		ph2.make="Android";
//		ph2.model="Galaxy8";
//		ph2.color="Black";
//		ph2.touchScreen=false;
//		ph2.camera=true;
//		
//		ph2.watchAMovie();
//		ph2.playGames();
//		ph2.recordAVideo();
//		
//		Phone ph3=new Phone();
//		ph3.make="Nokia";
//		ph3.model="G2";
//		ph3.color="Light Blue";
//		ph3.touchScreen=false;
//		ph3.camera=false;
//		
//		ph3.watchAMovie();
//		ph3.playGames();
//		ph3.recordAVideo();
//		
	}
	
	void walk() {
		System.out.println("You can watch a movie on your phone "+bread);
	}
	
	void play (){
		System.out.println("You can play games on your phone "+bread);
	}
	
	
	
}

