package com.class36;

public class WhyStringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		String str1="Hello";
		String str2="Hello";
		
		str1= str1="Hi";
		
		System.out.println(str1);

	}

}
