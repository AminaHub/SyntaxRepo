package com.Class9;

public class Task3 {

	public static void main(String[] args) {
	
		/*
		 * 3. Print the following pattern:
		 *	1
		 *	12
		 *	123
		 *	1234
		 *	12345
		 */
		
		for (int r=1; r<=5;r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
