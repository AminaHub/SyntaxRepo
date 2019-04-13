package com.class22;

public class PrivateStaticConstructors {
	
	//3. Write a program  that will have a private default constructor class and create 2 objects of this class:
	//		1 - inside same class; 
	//		2 - from outside the class.
	//4. Write program that have static constructor and observe result.
	
	private PrivateStaticConstructors () {
		System.out.println("I am a private constructor");
	}
	
	
	
	public static void main(String[] args) {
		PrivateStaticConstructors obj=new PrivateStaticConstructors();
	}

}
