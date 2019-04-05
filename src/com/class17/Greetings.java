package com.class17;

public class Greetings {
	
	public static void main(String[] args) {
		
		Greetings obj = new Greetings();
		obj.hello();
		//how to find lagest mumber
		obj.findLargest(20, 10);//calling method FindLargest and passing values 10, 20
		obj.findLargest(30, 31);//calling method FindLargest and passing values 30, 31
		obj.helloToInstructor("Weqas");
		obj.helloToInstructor("Arif");
		
	}
	
	
	//We always eed to gve a name for a method, and it is usually a verb
	void hello() {//method signature
		System.out.println("Hello");//method body
	}
	
	void helloToInstructor(String name) {// method with one parameter
		System.out.println("Hello "+name);
	}
	
	void findLargest(int a, int b) {//method use two parameters
		
		
		if (a>b) {
			System.out.println("A is largest than B");
		}else {
			System.out.println("B is largest that A");
		}
	}

}
