package com.class29;

	public class Square implements Shape {

		@Override
		public void calculateArea(int s) {
			System.out.println("Area of Square is : "+s*s);
			
		}

		@Override
		public void calculatePerimiter(int s1) {
			System.out.println("Perimiter of Square is : "+4*s1);
		}

	}
	

