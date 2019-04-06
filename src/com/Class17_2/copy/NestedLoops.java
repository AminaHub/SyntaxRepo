package com.Class17_2.copy;

public class NestedLoops {

	public static void main(String[] args) {
		
		NestedLoops obj=new NestedLoops();
		
		obj.printPattern();
		obj.printPattern1();
		obj.printPattern2();
		
		
		
//		for (int i=0; i<=5; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i=0; i<=5; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i=0; i<=5; i++) {
//			System.out.print(i);
//		}
		
	 
		 
	}
	
	void printPattern() {
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
	
		for(int i=5; i>=0; i--) {
			for(int y=0; y<=i; y++) {
			
				System.out.print("*");
			}
			System.out.println();
		}
	}	
		

	void printPattern1() {
		
		/*I want to print pattern
		 * 12345 -->4 rows & 5 columns
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for(int i=1; i<5; i++) {
			for(int y=1; y<6; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

	void printPattern2() {
		/*I want to print pattern
		 * 123456789 -->4 rows & 5 columns
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		
		for(int i=1; i<=5; i++) {
			for(int y=1; y<=9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
	
	void printPattern3() {
		/*I want to print pattern
		 * 1111111 -->4 rows & 5 columns
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 */
		for(int i=1; i<=7; i++) {
			for(int y=1; y<=7; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void printPattern4() {

		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		
		for(int i=0; i<4; i++) {
			for(int y=0; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
	void printPatter5() {
		/*
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for(int i=5; i>1; i--) {
			for(int y=5; y>=1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}	
		
	}
	
	void printPattern6() {
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		for(int i=5; i>=1; i--) {
			for(int y=5; y>=1; y--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void printPattern7() {
		/*
		 * *
		 * **
		 * ****
		 * *****
		 */
		
		for(int i=0; i<4; i++) {
			for(int y=0; y<=i; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	
	void printPattern8() {
		/*  ******  -->4 rows & columns =6
		 *  *    *
		 *  *    *
		 *  ******
		 */
		 
		for(int i=1;i<=4; i++) {
			  for(int y=1; y<=6; y++) {
				    if(i==1 || i==4 || y==1 ||y==6) {
				        System.out.print("*");
				    }else {  
				        System.out.print(" ");
				    }
				   
			  }	    
			  System.out.println();  
			
		}
	}
		
		
}
