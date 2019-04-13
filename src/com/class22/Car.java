package com.class22;

public class Car {

	public static String make="Toyota";
	String color;//declaring instance variable
	String model;
	int doors;
	boolean engine;
	Car(){//constructor
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor8111");
	}
	
	
	public static void main(String[] args) {
		//a interview question 
		//public-access modifier 
		//static- non access modifier
		//void-return type
		//main-name of a method
		//String[] args- parameters-array of Strings with name args
		
		Car obj=new Car();
		//Car-Class name
		//obj - reference variable/object name
		//=   - assigning operator
		//new -is a key word that creates a new object
		//Car() - Constructor will also initializes any variable that is not initialized
		//constructor will initialize Object and it will give default values to all uninitialized variables (global)
		//String/Object -null
		//boolean-false
		//int-0
		//The main role of constructor is to initialize instance variables
		
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();
	}
	
	public static void hello() {
		//before using local variable we have to initialize it
		String name;
		//System.out.println(name); compiler will give an error
		System.out.println("I am a static hello method");
	}
	
}
