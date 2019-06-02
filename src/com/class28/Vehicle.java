package com.class28;

public abstract class Vehicle {
	
	static int vehicleCount;
	Vehicle (){
		vehicleCount++;
	}
	//public static abstract void gps(); cannot have abstract methods as static (cannot override static)
	//private abstract void speed(); cannot have abstract method as a private methods hence cannot be abstract (do not part of inheritance)
	//public abstract final void break(); you cannot have abstract method as final because we cannot override it
	//protected abstract void start();
	protected abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}	
	public static void displayTotalVehicle() {
		System.out.println("Total vehicles we built= "+vehicleCount);
		
	}
}
abstract class Car extends Vehicle{
	
	/* by default compiler will create default constructor
	 * and by default inside the child constructor we call a parent class constructor
	 * 
	 * Car(){
	 * super();//added by default
	 * }
	 */
	public String make;//instance variables allowed in the abstrct class
	//We cannot create an abject of abstract class, but since we have an instance variable 
	//inside the class we need someone to initialize them-->perform by constructor
	Car(String make){
		this.make=make;
	}
}
class BMW extends Car{
	
	/* by default compiler wil create default constructor
	 * and by default inside the child constructor we call a parent class constructor
	 * BMW(){
	 * super();
	 * }
	 * 
	 */
	BMW(String make){
		super(make);
	}

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
		
	}
	
}

class Toyota extends Car{
	Toyota(String make){
		super(make);
	}

	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
		
	}
	
	
}
