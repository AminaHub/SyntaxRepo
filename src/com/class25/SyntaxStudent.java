package com.class25;

public class SyntaxStudent extends Student{
	
	public void study() {
		System.out.println("Syntax Student must study hard");
	}
	public void doHomeWork() {
		System.out.println("Syntax Student must do Repl");
	}
	
	protected void attendClasses() {
		System.out.println("Syntax Student must attend ALL classes");
	}
	
	//creating child specific private method doResearch
	private void doResearch() {
		
		System.out.println("Syntax Student must make uncle Google best friend");
		
	}

}
