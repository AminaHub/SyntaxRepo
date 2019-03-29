package com.Class8;

public class Task {

	public static void main(String[] args) {
		
//1-Print numbers from 1 to 100
//		for(int a=1; a<=100; a++) {	
//			System.out.println(a);
//		}

		
//2-Print numbers from 100 to 1
//		for(int b=100; b>=1; b--) {
//			System.out.println(b);	
//		}
		
		
//3-Print odd numbers from 1 to 20 (2 ways)
//		for(int c=1; c<=20; c+=2) {
//			System.out.println(c);
//		}
	
//4-Print even numbers from 20 to 1 (2 ways)
//		for(int d=20; d>=2; d-=2) {
//			System.out.println(d);
//		}
		

		
//5-Print even numbers between 20 and 50 (2 ways)
		// 1 way
//		for (int z=20; z<=50; z+=2) {
//			System.out.println(z);
//		}
		
		//2 way
//		for(int z=20; z<=50; z++) {
//			if(z%2==0) {
//				System.out.println(z);
//			}
//		}

//6-Print odd numbers between 20 and 50 (2 ways)
		//1 way
		for(int s=21; s<=50; s+=2) {
			System.out.println(s);
		}
		
		//2 way
		for(int s=20; s<=50; s++) {
			if(s%2==1) {
				System.out.println(s);
			}
		}
	}
	

}
