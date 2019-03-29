package com.class10;

public class AllValues {

	public static void main(String[] args) {
		               
		          //index 0, 1,  2,  3,  4,  5
		char[] grades= {'A','B','C','D','E','F'};//size is 6
		
		for (int i=0; i<=grades.length-1; i++) {  //when i reaches 6 index will be 6 but there will be no index 6 so we subtract 1 from the length
			System.out.println(grades[i]);
		}

	}

}
