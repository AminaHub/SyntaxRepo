package com.class17;

public class NoMainMethod {
	
	//methods and variables are member of the class
	
	//main methd starts the execusion code
	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {//method signature
	
	NoMainMethod obj=new NoMainMethod(); //method body
	obj.hello(); //we are calling a method hello
	obj.bye();
	obj.howAreYou();
	
	}
	
	void howAreYou (){
		System.out.println("How Are You");
	}
		
	}


