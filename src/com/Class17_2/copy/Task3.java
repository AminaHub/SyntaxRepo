package com.Class17_2.copy;

public class Task3 {

	public static void main(String[] args) {
	
		Task3 obj=new Task3();
		/*
		 * 3. Print the following pattern:
		 *	1
		 *	12
		 *	123
		 *	1234
		 *	12345
		 */
		
//		for (int r=1; r<=5;r++) {
//			for(int c=1; c<=r; c++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		
		obj.printPatern();

	}
	
	void printPatern() {
		
		for (int r=1; r<=5;r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
