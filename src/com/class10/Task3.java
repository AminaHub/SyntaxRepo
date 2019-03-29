package com.class10;

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
		for(int i=1; i<=5; i++) {
			for(int k=1;k<=i; k++) {//k<=i because columns are dependent on number of raws
				System.out.print(k);//we need to print k because k will be changing but i will not change if I print i here will have 1
																																	//22
																																	//333
																																	//4444
																																	//55555					
			
			}
			System.out.println();	
		}
		

	}

}
