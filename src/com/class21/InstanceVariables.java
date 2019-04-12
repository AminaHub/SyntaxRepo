package com.class21;

public class InstanceVariables {
	private String name="John";
	
	public static void main(String[] args) {
		String name="Anna";//this variable is local variable and not visible to the class
		System.out.println(name);
		System.out.println("-------Changing value of local variable----");
		name="Olga";
		System.out.println(name);
		//creating 1 object
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("------Changing value of instance variable------");
		obj.name="Jack";
		System.out.println(obj.name);
		//creating second object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
	}
	
	public void hello() {
		System.out.println("Hello"+name);
	}

}
