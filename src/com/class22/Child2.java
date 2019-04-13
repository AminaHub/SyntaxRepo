package com.class22;

public class Child2 extends Parent{

		String hairType="curly";
		public static void main(String[] args) {
			
			
			Child2 childObject2=new Child2();
			System.out.println("Child 1 eye color "+childObject2.eyeColor);
			System.out.println("Child 1 hair color "+childObject2.hairColor);
			System.out.println("Child 1 has "+childObject2.nose);
			childObject2.sing();
			childObject2.canSwim();
			
			
			Parent parentObject=new Parent();
			//parentObject.hairType --> not accessible in Parent class
			//parentObject.playTennis()-->not accessible in parent class
			
			
		}
		public void canSwim() {
			System.out.println("Child 2 can swim");
		}

	

}
