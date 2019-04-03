package com.class15;

public class IntervieQuestions1 {

	public static void main(String[] args) {
		/* 1.Write a program to swap 2 numbers without a temporary variable? 
		*Swap 2 strings without a temporary variable?
		*/
		//inegers
		int a=10;
		int b=20;
		a=a+b;//10+20=30 a=30
		b=a-b;//3-20=10 b=10
		a=a-b;//30-10=20 a=20
		
		System.out.println("The value of a=" +a+" the value of b="+b);
		
		
		//Strings
		String str1="Hello";
		String str2="World";
		
		str1=str1+str2;//Helloworld use substring to get part of this string
		str2=str1.substring(0,str1.length()-str2.length());//10-5=5 str2 = Hello
		str1=str1.substring(str2.length());		
		System.out.println("The value of str1: "+str1+" The value of str2 "+str2);
		
//		String str = "Best";       
//		String str1 = "Group";        
//		System.out.println("After swap str is: " + str.replace("Best", "Group"));        
//		System.out.println("After swap str1 is: " + str.replace("Group", "Best"));
		
	}

}
