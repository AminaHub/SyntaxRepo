package com.class29;

public class Circle implements Shape {

	@Override
	public void calculateArea(int r) {
		System.out.println("Area of Circle is : "+3.14*r*r);
		
	}

	@Override
	public void calculatePerimiter(int r1) {
		System.out.println("Perimiter of Circle is : "+2*3.14*r1);
	}
	

}
