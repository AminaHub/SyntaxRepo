package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Begining of the code");
		
		try {
		Thread.sleep(2000);//object of an exception might be thrown(new InterruptedException)
		}catch (InterruptedException e) {
			e.getMessage();
			System.out.println("I am a catch block code");
		}
		System.out.println("The end of the program");
		//	InterruptedException e=new InterruptedException();
		//Exception e=InterruptedException();	
	}

}
