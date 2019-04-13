package com.class22;

public class StaticVsNonStatic {
	public String name="John";//instance variable
	public static String lastName="Snow";//static variable
	
	public static void main(String[] args) {
		StaticVsNonStatic obj= new StaticVsNonStatic();
		obj.getInfo();
		getInfo1(); //because it is a static method it doesnot belong to any thing except the class
					//within same class we can call it by using method/variable name
		System.out.println(lastName);
		System.out.println(obj.name);//name is an instance variable we can only call it with an object(obj)

	}
	// non static method-can access both instance and non static variables
	public void getInfo() {
		System.out.println("My name is "+name+ " and my last name is "+lastName);
		//getInfo1(); we can ccess static method within non static
	}
	//static method
	
	// static methods can have only access to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+ "and my last name is "+lastName);
		//will get an error
		System.out.println("I am a static method");
		//getInfo(); we cannot access nonstatic method within static method
		
	}
	
}
