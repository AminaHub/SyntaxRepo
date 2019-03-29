package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		// Length function/or method-return 
		String str="Syntax";
		str.length(); //return the number of characters in the string
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		//toUpperCase-->convert all characters to upperCase
		//toLowerCase-->convert all characters to lowerCase
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//equals() - compares 2 strings, if strings are equal-->true, else-->false
		String str4="Hello";
		String str5="hello";
		str4.contentEquals(str5);
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		//equalsIgnoreCase()- compares 2 strings but ignores case (upper or lower case)
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
		
	}

}
