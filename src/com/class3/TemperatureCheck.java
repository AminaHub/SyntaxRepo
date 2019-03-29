package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		int a=30;
		int b=32;
		
		if (a<b) {
			System.out.println("water will freeze with temprature "+a);
			
		}else {
			System.out.println("water will NOT freeze with temprature "+a);
		}
		
		int c=50;
		int waterTemp=32;
		
		if (c<waterTemp) {
			System.out.println("water will freeze with temprature "+c);
			
		}else {
			System.out.println("water will NOT freeze with temprature "+c);
		}
		
		System.out.println("water will freeze only if the temprature goes below "+waterTemp);
	}

}
