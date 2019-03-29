package com.ReviewSession;

public class ClassFour {

	public static void main(String[] args) {
		/*
		 * Write a program that prints "I am feeling happy today" 10 times using for
		 * loop and while loop
		 * 
		 * Write a program that prints starting at 18 decreasing in multiples of 3
		 * 18
		 * 15
		 * 12
		 * 9
		 * 6
		 * 3
		 * 0
		 */
				
//	
//		int num=1;
//		
//		while(num<=10) {
//			System.out.println(num+" - "+"I am feeling happy today ");
//			num++;
//						//System.out.println("I am feeling happy today");
//		}
		
//		int i=0;
//		boolean happy=true;
//		while(happy) {
//			if(i==10) {
//				break;
//				happy=false;
//			}
//			System.out.println("I am feeling happy today");
//			i++;			
//			}
//		
//		for (int i=0; i<10; i++) {
//			
//			System.out.println(i+" - "+"I am feeling happy today ");
//			
//		}
		
//		int num=18;
//		while(num>=0) {
//			if(num%3==0) {
//			System.out.println(num);
//			}
//			num--;
//			
//		}
		
		
//		for (int j=18; j>=0; j-=3) {
//			System.out.println(j);
//		}
		
//		for (int i=18; i>=0; i--) {
//			if (i%3==0) {
//				System.out.println(i);
//			}
//		}
		
/* write a program that prints the string "the time is 07:min"
*		+ "and then all the mins till 7:30
*/
String a="the time is 07:";		
for (int i=0; i<=30; i++) {
	if (i < 10) {
	System.out.println("the time is 07:0"+ i);
	} else {
		System.out.println("the time is 07:" + i);
	}
		
}
//	System.out.println(+i);
//}


		int min = 0;
//		while (min <= 30) {
//			if (min < 10) {
//				System.out.println("the time is 07:0"+ min);
//			} else {
//				System.out.println("the time is 07:" + min);
//			}
//			min++;
//		}
		
do {
	if (min < 10) {
	System.out.println("the time is 07:0"+ min);
	} else {
		System.out.println("the time is 07:" + min);
	}
	min++;
}while(min<=30);
	
		
		
	}

}
