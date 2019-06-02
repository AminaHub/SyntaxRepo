package com.ReviewSession;

public class ChildSuper extends MainSuper {
	
	int number=12;
	 boolean b=false;
	 String st1="AnyChild";
	
	ChildSuper(String c){
		super(c);
		System.out.println("This is child with 1 parameter "+ c);
		
	}
	ChildSuper(String c1, String c2){
		super(c1, c2);
		System.out.println("This is child with 2 parameter "+c1+" and "+c2);
		
	}
	
	void print() {
		
		System.out.println(super.number + " "+ super.b+" "+super.st1);
		System.out.println(number+" "+b+" "+st1);
		
	}

	public static void main(String[] args) {
		ChildSuper obj=new ChildSuper("Hello", "Class");
		obj.print();
		
		
	}
}
