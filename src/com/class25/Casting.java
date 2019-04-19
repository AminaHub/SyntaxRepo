package com.class25;

public class Casting {

	public static void main(String[] args) {
		
		//implicit or automatic casting or widening--compiler takes care of conversion
		double a=10;
		System.out.println(a);
		
		//explicit/manual/narrowing casting--programmer takes care of conversion
		double b=10.0;
		int c=(int)b;
		System.out.println(c);
		int i=130;
		//byte by=130; --> compiler wont allow
		
		byte by=(byte)i;
		System.out.println(by);
		//upcasting--> -- compiler takes care of conversion
		Payment pay=new MasterCard();
		
		//MasterCard mc=new Payment(); --compiler wont allow you
		//DownCasting
		//MasterCard mc=(MasterCard) new Payment();
		

	}

}
