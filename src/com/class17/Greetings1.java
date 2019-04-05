package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Omer");//argument

	}
	
	//You need to give unigue name to method and can't have a duplicate method with the same name and parameters
	void askHowAreYou(String name) {//parameter
		System.out.println("How Are You "+name);
	}
	
	//void is a return type, askHowAreYou-name of the method
	void askHowAreYou1(String name) {
		System.out.println("How Are You "+name);
	}
	
	void askHowAreYou2(String name) {
		System.out.println("How Are You "+name);
	}	

}
