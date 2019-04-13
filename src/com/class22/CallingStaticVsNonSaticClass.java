package com.class22;

public class CallingStaticVsNonSaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		//accessing non static method
		obj.getInfo();
		//access static members by using className they belong to
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();
		

	}

}
