package com.class21;

public class localVariables {

	public static void main(String[] args) {
		String name ="John";
		System.out.println(name);
		
		localVariables obj=new localVariables();
		obj.hello(name);
		System.out.println(name);

	}
	
	public void hello(String name) {
		name="Jack";
		System.out.println("Hello "+name);
	}

}
