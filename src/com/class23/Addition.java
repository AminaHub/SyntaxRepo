package com.class23;

public class Addition {

	public void add(int a, int b) {
		System.out.println("method to add two integers");
		System.out.println(a+b);
	}
	
	public void add(int a) {    //by changing the parameters of the add method the compiler will not complain about the same name
		System.out.println("method to add 100 to an integers");						//method overloading- one way the method will behave differently by changing number of parameters
		System.out.println(a+100);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("method to add three integers");
		System.out.println(a+b+c);
	}
	
	// another way of overloading by changing the type of the parameters
	public void add(int a, double b) {
		System.out.println("method to add one integers value to one double value");
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println("method to add two double values");
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println("method to add three double values");
		System.out.println(a+b+c);
	}
}
