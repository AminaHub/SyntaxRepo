package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create an entry of names thats will holds 5 elements and retrieve all values
		
//		String[] names=new String[5];
//		names[0]="Asel";
//		names[1]="Awet";
//		names[2]="Arif";
//		names[3]="Waqas";
//		names[4]="Dzmitri";
//		//names[5]="Shiva";will get a runtime exception when trying to access it
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}

		
//		String[] names=new String[6];
//		names[0]="Asel";
//		names[1]="Awet";
//		names[2]="Arif";
//		names[3]="Waqas";
//		names[4]="Dzmitri";
//		names[5]="Shiva";   //will get a runtime exception when trying to access it
//		//names[6]="Sandesh";
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		

//		String[] names=new String[7];
//		names[0]="Asel";
//		names[1]="Awet";
//		names[2]="Arif";
//		names[3]="Waqas";
//		names[4]="Dzmitri";
//		names[5]="Shiva";   //will get a runtime exception when trying to access it
//		names[6]="Sandesh";
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}

		
		//2. create an array using array literal
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zeki", "Samir","Frank"};
		
		System.out.println("-------------"
				+ "for loop--------------");
		for(int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
	    }

		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-------------advanced for loop--------------");
		for(String student:studentNames) {
			System.out.println(student);
		}
	}

}
