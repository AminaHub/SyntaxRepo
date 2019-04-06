package com.Class17_2.copy;

import java.util.Scanner;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two integers: ");
		
		int a= scan.nextInt();
		int b = scan.nextInt();
		
		
		
		int s=obj.sum(a,b);
		System.out.println("The sum of two integers is: "+s);
		
		s=obj.sub(a,b);
		System.out.println("The diffrence of two integers is: "+s);
		
		s=obj.div(a,b);
		System.out.println("The division of two integers is: "+s);
		
		s=obj.mult(a,b);
		System.out.println("The multiplication of two integers is: "+s);

	}

}
