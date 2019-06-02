package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		Car car=new BMW("bmw");
		car.drive();
		car.start();
		car.stop();

		Car car1=new Toyota("Sienna");
		car1.drive();
		car1.start();
		car1.stop();
		
		Vehicle.displayTotalVehicle();
		
		System.out.println(Vehicle.vehicleCount);
		
		new BMW("bmw");
		new Toyota("Sienna");
		
		System.out.println(Vehicle.vehicleCount);
		
	}
	

}
