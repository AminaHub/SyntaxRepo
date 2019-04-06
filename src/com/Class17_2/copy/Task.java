package com.Class17_2.copy;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * 1. Write a program that reads a range of integers(start and end point) , 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 * 
		 */
     
//		
//		int start;
//		int end;
//		int sumEven=0;
//		int sumOdd=0;
//		Scanner input=new Scanner(System.in);
//		
//		System.out.println("Please enter start and end integer  ");
//		start=input.nextInt();
//		end=input.nextInt();
//		
//		if(start<end) {
//		for(int i=start; i<=end; i++) {
//			
//			if(i%2==0) {
//				sumEven+=i;//sumEven=sumEven+i
//			}else {
//				sumOdd+=i;
//			}
//		}
//		System.out.println("The sum of your even numbers is "+sumEven);
//		System.out.println("The sum of your odd numbers is "+sumOdd);
//		}
//		}
		
		 /*
         * Write a program that reads a range of integers (start and end point),
         * provided by a user and then from that range prints the sum of the even and
         * odd integers.
         */
//        Scanner input;
//        int startPoint;
//        int endPoint;
//        int sumofEven = 0;
//        int sumofOdd = 0;
//        input = new Scanner(System.in);
//        System.out.println("Enter your start point: ");
//        startPoint = input.nextInt();
//        System.out.println("Enter your end point: ");
//        endPoint = input.nextInt();
//
//        if (startPoint < endPoint) {
//            
//            for (int a = startPoint; a <= endPoint; a++) {
//                if (a % 2 == 0) {
//                    sumofEven += a;
//                } else {
//                    sumofOdd += a;
//                }
//
//            }
//            
//            System.out.println(" Your sum of even numbers are: " + sumofEven);
//            System.out.println(" Your sum of odd numbers are: " + sumofOdd);
//
//        }
//
//    }
//}




		
//		2. Ask user to enter the item they want to buy and  the price for the item. 
//		 * Then ask user to pay for it. Every time user enters money accumulate the amount 
//		 * and tell user how much is left to pay off the amount. 
//		 * Whenever user done with payments tell them "Thank you for shopping!"
		
//		
//		Scanner scan;
//		double price;
//		scan=new Scanner(System.in);
//		
//		do {
//		System.out.println("Please pay for soda");
//		price=scan.nextDouble();
//		}while(price!=1.99);
		
		//System.out.println("Please enjoy your soda");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter item  ");
		String item=input.nextLine();
		System.out.println("Please enter price ");
		double price=input.nextDouble();
		double payment=0.0;
		double total=0.0;
		
				do{
					System.out.println("Please enter payment:");
				    payment=input.nextDouble();
				    total=total+payment;
				    System.out.println((price-payment)+ "$ is how much money left from "+item+" price to pay");
				}while(payment<price);
		
				System.out.println("Thank you for shopping");
		
		
		 
		}

}
