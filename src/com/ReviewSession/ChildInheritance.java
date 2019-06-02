package com.ReviewSession;

public class ChildInheritance extends MainInheritance {   
	public void swapNumbers(int a, int b) {        
		System.out.println(a);        
		System.out.println(b);    }    
	public void swapWords(String a, String b) {        
		System.out.println(a + " " + b);    
	}
	//-----above is from child-------------    
	void parentNumbers(int a, int b) {        
		super.swapNumbers(a, b);   
		}   
	void parentString(String a, String b) {       
			super.swapWords(a, b);    }   
	public static void main(String[] args) {        
		ChildInheritance child=new ChildInheritance();       
		child.parentNumbers(5, 6);        
		child.parentString("Shaban", "Haq");   
	}
}