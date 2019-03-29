package com.class3;

public class Modules {

	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		int div=a/b;
		
		System.out.println(div); //3 or 3.3 it will give 3 
        //because int can't hold decimal numbers
		
		
		//Modulus operator
		int mod=0%b;
		System.out.println(mod); //1
		
		
		int q=101;
		int w=10;
		System.out.println(q%w);
		//Parentheses, Exponents, Multiplication/Division, Modulus, Addition/Subtraction
		int e=-5+4*5;
		System.out.println(e); //19
		int x=(22+9) % 7;
		System.out.println(x);
		
		int y= 20 + -3*5 / 8;
		System.out.println(y); //28; 27; 19; 18
		
		int z= 5+15/3*2-8%3; // (5+10+2)
		System.out.println(z); //13
		
		
		System.out.println(div); //3 or 3.3 it will give 3 
		                         //because int can't hold decimal numbers
		
		//modulus operator
		
		int mod1=a%b;
				
		System.out.println(mod);		

	}

}
