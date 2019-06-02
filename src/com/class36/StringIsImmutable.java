package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		//2 ways to create a string
		//1st way -using String Literal
		String str="Hello";
		
		//2nd way
		String str2=new String("Bay");
		
		str=str.toUpperCase();//we are reassigning completely a new object
		str=str.replace("O","a");// we are reassigning str to a completely new string object
		
		System.out.println(str);

	}

}
