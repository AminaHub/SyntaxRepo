package com.class25;

public class Animal {
	
	public static void whoAmI(){
		
		System.out.println("I am an animal");
		
	}
}	
	
	class Puppy extends Animal {
		
		/*cannot override static method with istance
		 * public void whoAmI(){
		 * System.out.printLn("I am a puppy")
		 * } 
		 */
	}		
	class Monkey extends Animal{
		public static void whoAmI() {// you can't override a static method
			System.out.println("I am a Monkey");
			
		}
	}
		
	


