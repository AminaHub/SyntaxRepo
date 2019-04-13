package com.class22;

public class Child1 extends Parent{
	String hairType="curly";
	public static void main(String[] args) {
		
		
		Child1 childObject=new Child1();
		System.out.println("Child 1 eye color "+childObject.eyeColor);
		System.out.println("Child 1 hair color "+childObject.hairColor);
		System.out.println("Child 1 has "+childObject.nose);
		childObject.sing();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent class
		//parentObject.playTennis()-->not accessible in parent class
		
		
	}
	public void palyTennis() {
		System.out.println("Child 1 can paly Tennis");
	}
}
