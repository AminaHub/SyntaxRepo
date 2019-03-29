package com.Class9;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * 4. Print the following pattern:
		 * 
		 *	*
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		
		for (int r=1; r<=5; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print("*");
			}
		 System.out.println();	
		}	
		for (int rr=1; rr<=4; rr++) {
			for(int cc=4; cc>=rr; cc--) {
				System.out.print("*");
		    }
			System.out.println();	
		}
		
	}		

}
