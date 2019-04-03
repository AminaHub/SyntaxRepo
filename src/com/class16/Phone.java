package com.class16;

public class Phone {

	// task 1
	String make, model, color;
	boolean touchScreen, camera;
	
	
	
	public static void main(String[] args) {
		
		Phone ph1=new Phone();
		ph1.make="iPhone";
		ph1.model="X10";
		ph1.color="Silver";
		ph1.touchScreen=true;
		ph1.camera=true;
		
		ph1.watchAMovie();
		ph1.playGames();
		ph1.recordAVideo();
		
		Phone ph2=new Phone();
		ph2.make="Android";
		ph2.model="Galaxy8";
		ph2.color="Black";
		ph2.touchScreen=false;
		ph2.camera=true;
		
		ph2.watchAMovie();
		ph2.playGames();
		ph2.recordAVideo();
		
		Phone ph3=new Phone();
		ph3.make="Nokia";
		ph3.model="G2";
		ph3.color="Light Blue";
		ph3.touchScreen=false;
		ph3.camera=false;
		
		ph3.watchAMovie();
		ph3.playGames();
		ph3.recordAVideo();
		
	}
	
	void watchAMovie() {
		System.out.println("You can watch a movie on your phone "+make);
	}
	
	void playGames (){
		System.out.println("You can play games on your phone "+make);
	}
	
	void recordAVideo(){
		System.out.println("You can record a Video with your Phone "+make);
	}
	
}
