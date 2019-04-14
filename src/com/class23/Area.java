package com.class23;
//Create 1 class in which create a method that will calculate the area of
//Rectangle-area width*length(5*4)
//Square-area -width*width(4)
//Cube-volume-width*length*height(3*4*5)
//Use separate class to test code


public class Area {
	
//	public int getArea(int a, int b) {
//		System.out.println("Area of rectangle is "+(a*b));	
//		return a*b
//	}//compiler gives an error
	
	public void getArea(int a, int b) {
		System.out.println("Area of rectangle is "+(a*b));	
	}
	public void getArea(int a) {
		System.out.println("Area of square is "+(a*a));
	}
	
	public void getArea(int a, int b, int c) {
		System.out.println("Area of a box is "+(a*b*c));
	}
	
}
