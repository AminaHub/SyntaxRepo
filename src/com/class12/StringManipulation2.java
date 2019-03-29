package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		// Contains()--> checks specific value in the string
		//if value is present--> true, elase--> false
		
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		
		String present="Welcome, Asel";
		String neededValue="Welcome";
		boolean flag=present.contains("Welcome,");
		System.out.println(flag);
 
		boolean flag1=present.toLowerCase().contains(neededValue);
		System.out.println(flag1);
		
		//startsWith(), 3ndsWith(), will return true if String starts/ends with
		//else -->false
		
		System.out.println("------------------startWith & endsWith-----------");
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		
		System.out.println(str1.endsWith("y"));
		
		//isEmpty() if length of a string is=0 -->string is empty else -->it is not
		System.out.println("------------------isEmpty()-----------");
		String str2="Hello";
		boolean isEmpty= str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat() --> will concatenate 1 string to the end of another
		String str3="Hello";
		String str4="Ali!";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//Trim() --> will remove spaces at the begining and at the end of your string
		
		String expected="You may qualify for a multi-policy discount!";
		String actual=" You may qualify for a multi-policy discount!";
		actual=actual.trim();
		System.out.println(expected.contentEquals(actual));
		
		
	}

}
