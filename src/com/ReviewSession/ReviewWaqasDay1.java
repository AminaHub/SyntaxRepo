package com.ReviewSession;

import java.util.Scanner;

public class ReviewWaqasDay1 {
	//Global attributes
	String eyes;
	String hair;
	String nose;
	String shirt;
	boolean noReturn=true;
	
	

	public static void main(String[] args) {
		ReviewWaqasDay1 waqas=new ReviewWaqasDay1();
		waqas.eyes="blue";
		waqas.hair="blue";
		waqas.nose="brown";
		waqas.shirt="gray";
		
		waqas.vowelCountWithReplaceAll();

		
		
		//waqas.eyes="green";
//		System.out.println(waqas.eyes);
//		
//		ReviewWaqasDay1 waqas1=new ReviewWaqasDay1();
//		waqas1.eyes="green";
//		System.out.println(waqas1.eyes);
//		
		//waqas.noReturn();
		
		//waqas.scannerFirstName();
		//waqas.scannerInt();
		//waqas.reverseString();
	}
	
	//void has no return type it is empty
	void humanEyes() {
		ReviewWaqasDay1 waqas=new ReviewWaqasDay1();
		waqas.eyes="red";
		System.out.println();
		
	}
	
	void noReturn() {
     System.out.println("I don't have a return value");		
		
	}
	void scannerFirstName() {
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
	
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.hasNextInt();
	}
	
	void reverseString() {
		String str="seigolonhceT xatnyS";
		String reverse="";
		for(int i=str.length(); i>0; i--) {
			reverse=reverse+str.substring(i-1, i);
			//or reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
	}
	
//	void returnVowels() {
//		String waqas="hello.wOrld.my.nAme.is.wEqas";
//				
//		char[] w=waqas.toCharArray();
//		char empty;
//		
//		for(int i=0; i<=w.length-1; i++) {
//			if(w[i]=='a'||w[i]=='A' || w[i]=='e' || w[i]=='E' ||w[i]=='i' ||w[i]=='I' ||w[i]=='o' ||w[i]=='O' ||w[i]=='u' ||w[i]=='U')
//			{			
//				empty=w[i];
//				System.out.println(empty+",");
//			}
//		}
//		
//	}
	
	void vowelCountWithReplaceAll() {
		String waqas="hello wOrld.my.nAme.is.wEqas";
		String replace = waqas.replaceAll("[^aA,eE,iI,oO,uU]","");
		System.out.println(replace);
		
	}
	

}
