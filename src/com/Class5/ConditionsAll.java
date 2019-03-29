package com.Class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		/*
		 * Ask user to enter price and boolean value for sale
		 * based on the sale we will check the price:
		 * if price <=20, we apply discount 20% and give final price
		 * if price is more than 20 and less 100 --> apply discount 30% and give final price
		 * if price is >100 less 500--> apply discount 50% and give final price
		 */
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		
		//System.out.println("Please enter price of the item");
		//price=scan.nextInt();
		
		if (sale) {
			
			System.out.println("Please enter price of the item");
			price=scan.nextInt();
			
			//double finalPrice;
			
			System.out.println("Let's check all discounts");
			if(price<20) {
				discount=20;
				finalPrice=price-(price*0.2);
			}else if (price>=20 && price<100) {
				discount=30;
			    finalPrice=price-(price*0.3);
			}else if(price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
			}else {
				discount=75;
				finalPrice=price-(price*0.75);
			}
			System.out.println("Final price is "+finalPrice); 
		}else {
			System.out.println("I am not interested");
		}
		//System.out.println("Final price is "+finalPrice); finalPrice here will not be executed because it is outside 
		//the if statement where we initialize the value of the variable. 
		//It will be recognized if we assign the initial value to 0 when we diclare it
	}

}
