package com.class10;

public class Tasks {

	public static void main(String[] args) {
//		1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
//
//		
//
        //First way
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		//second way
		char[] grades2= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		
		
//	2.Create an array of names and store all names of your group. 
//	Then print your name from that array. (use 2 different ways of creating an array).	
		
		//First way
		String[] groupMembersNames = {"Jawid", "Mahri","Amina","Mustafa","Emily"}; 
		
		System.out.println(groupMembersNames[2]);
		
		//second way
		String[] group2=new String[5];
		group2[0]="Jawid";
		group2[1]="Mahri";
		group2[2]="Amina";
		group2[3]="Mustafa";
		group2[4]="Emily";
		
		System.out.println(group2[2]);
		
//		3.Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using element of array: “Saturday is Java coding Day”.
		
		String[] words= {"Java","Saturday", "day","coding", "is"};
		
		String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		System.out.println(sentence);
		
		int size=words.length;
		System.out.println("The size of an array is "+size);
		
		
				
	}

}
