package com.class10;

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
		
		for(int i=1; i<=5; i++) {
			for(int k=1;k<=i; k++) {//k<=i because columns are dependent on number of raws
				System.out.print("*");					
			}
			System.out.println();	
		}
		for(int i=1; i<=4; i++) {
			for(int y=4; y>=i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
