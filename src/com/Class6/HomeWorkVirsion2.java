package com.Class6;

import java.util.Scanner;

public class HomeWorkVirsion2 {

	public static void main(String[] args) {
		
		int num1, num2, num3, largest=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double values");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		if (!(num1==num2 && num1==num3 && num2==num3)) {
		//5, 3,4
		  if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}
		  }else {//assuming num2>num1
			if(num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		  }
		 }else {
		   System.out.println("all numbers are equal");
	     }
		
		System.out.println("The largest number is "+largest);
}
}
