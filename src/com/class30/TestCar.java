package com.class30;

public class TestCar {

	public static void main(String[] args) {
		Car car=new Truck("blue", 25000, 3000);
		double carPrice=car.calculateSalePrice();
		System.out.println(carPrice);
		
		car=new Truck("blue", 25000, 4000);
		double carPrice1=car.calculateSalePrice();
		System.out.println(carPrice1);
	}

}
