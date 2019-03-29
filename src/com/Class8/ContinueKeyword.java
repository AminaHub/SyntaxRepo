package com.Class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		//Continue will skip an iteration
//		for(int i=0; i<10; i++) {
//			if(i==2) {
//			continue;	
//			}
//		System.out.println(i);	
//		}

		//with multiple conditions
//		for(int i=0; i<10; i++) {
//			if(i==2 || i==3) {
//			continue;	
//			}
//		System.out.println(i);	
//		}
		
		
		//I want to print numbers from 1 to 20 but skip those that divisible by 3
		
		for(int a=1; a<=20; a++) {
			
			if(a%3 == 0) {
				continue;
			}
		System.out.println(a);	
			
		}
	}

}
