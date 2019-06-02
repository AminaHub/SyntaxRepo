package com.ReviewSession;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//** Create a class called StringsReview in it        
		//* Write a program to concatenate or append 'def' to string 'abc' using       
		//* StringBuffer and string 'ghi' to the concatenated string 'abcdef' using         
		//* String builder.         */
				
			String str="abc";
//			str.concat(" abc");//New string got created ("Good Morning")
//			System.out.println(str);
//			
//			System.out.println("--------------------");
			
			StringBuffer sb=new StringBuffer(str);// the same object will be appended
			sb.append("def");
			
			System.out.println(sb);
			
			StringBuilder sb1=new StringBuilder (sb);
			sb1.append("ghi");
			System.out.println(sb1);

		}

	}


