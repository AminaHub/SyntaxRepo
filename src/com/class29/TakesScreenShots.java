package com.class29;

public interface TakesScreenShots {
	
 String fileExtension=".png"; //by default this is public static final and it must be initialized
 void takesScreenShot();
		
	// from java 8 in interface we can have defined methods in interface and they can either be static or default
static void m1() {
	System.out.println("Static m1 method");
}

default void m2() {
	System.out.println("default m2 method");
	
}
}
