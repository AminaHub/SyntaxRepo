package com.class23;

public class MainMethodOverload {

	public static void main(String[] args) {
		System.out.println("I am a main method with string argument array");

	}
	
	public static void main() {// main method can be overloaded by changing its paramaters
		System.out.println("I am a main method with no parameters");
	}
	
	public static void main(String args) {
		System.out.println("I am a main method with string parameters");

	}
	
	public static void main(int a) {
		System.out.println("I am a main method with integer parameter");

	}

}
