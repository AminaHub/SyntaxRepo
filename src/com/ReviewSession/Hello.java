package com.ReviewSession;

public class Hello {
	
	Hello(String a){
		this ("hello", "bye");
		System.out.println("This is the vlue  of a: "+a);
		
	}
	
	Hello(String a, String b){
		this ("First", "Second","Third");
		System.out.println("This is the vlue  of b: "+b);
		
	}
	Hello(String a, String b, String c){
		System.out.println("This is the vlue  of c: "+c);
	
	}

	public static void main(String[] args) {
		Hello obj=new Hello("A");
		
		
		// TODO Auto-generated method stub

	}

}
