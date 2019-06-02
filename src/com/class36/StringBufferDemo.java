package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("Hello");
//		sb.deleteCharAt(3);
//		
//		System.out.println(sb);
		
		String str="Good Morning";
		str.concat(" Jhon");//New string got created ("Good Morning")
		System.out.println(str);
		
		System.out.println("--------------------");
		
		StringBuffer sb=new StringBuffer("Good Morning");// the same object will be appended
		sb.append(" Jhon");
		
		System.out.println(sb);
		

	}

}
