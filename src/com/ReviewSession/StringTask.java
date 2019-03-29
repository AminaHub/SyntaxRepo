package com.ReviewSession;

public class StringTask {

	public static void main(String[] args) {
		/*
		 *  length()         
		 *  toLowerCase()         
		 *  toUpperCase()         
		 *  equals(Object anObject)     
		 *  equalsIgnoreCase(String anotherString)         
		 *  contains(String anotherString)         
		 *  startsWith(String prefix)         
		 *  endsWith(String suffix) isEmpty()         
		 *  concat(String str)         
		 *  trim()         
		 *  charAt(int index)         
		 *  indexOf(int ch)         
		 *  substring(int beginIndex)         
		 *  substring(int beginIndex, int endIndex)         
		 */        
		
		/* Write a program that:         
		 * Converts all the characters in the string to lower case and prints.        
		 * Converts all the characters in the string to upper case and prints.         
		 * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.         
		 * Counts the number of letter 'a' in the string/paragraph and prints.         
		 * Prints the second half of the string/paragraph.        
		 * Prints characters between the 10th and 20th indices(inclusive).         
		 * Prints the string/Paragraph in reverse order.         
		 * Clears/removes all white spaces or tabs on both ends and prints.         
		 */       
		
		String para = "The quick brown fox jumps over the lazy dog.";
		
		int par1=para.length();
		System.out.println(par1);
		
		String LCase= para.toLowerCase();
		System.out.println(LCase);
		
		String UCase=para.toUpperCase();
		System.out.println(UCase);
		
		
		String eq="AHYJK NYUGF MUNB NOPLM";
		boolean eq1= para.equals(eq);
		System.out.println(eq1);
			
		
		System.out.println(para.toLowerCase());
		System.out.println(para.toUpperCase());
		System.out.println(para.startsWith("The"));
		System.out.println(para.endsWith("The"));
		
		//counts the number of letter 'a' in the string/paragraph and prints
		
		int count=0;
		for(int i=0; i<para.length(); i++) {
			if(para.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println(para.substring(para.length()/2)); //Prints the second half of the string/paragraph. 
		
		System.out.println(para.substring(10,20)); //Prints characters between the 10th and 20th indices(inclusive).
		
		//Prints the string/Paragraph in reverse order.
		for(int i=para.length(); i>=0; i--) {
			System.out.println(para.charAt(i));
		}
		
		//Clears/removes all white spaces or tabs on both ends and prints.
		
		System.out.println(para.trim());
		
		
		
		//awet(Instructor) [10:01 PM]/ 
		//Write a program that prints last character of each word in a string       
		//String str = "Syntax Technologies";
	
	}

}
