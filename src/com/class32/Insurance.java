package com.class32;

/*
 * Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour 
 * as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. 
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
 * Create 3 objects of the sub classes and store them in ArrayList.
 *  Using 1 reference variable access methods from different classes.
 */

public abstract class Insurance {
public String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public void openAccount() {
		System.out.println("Open"+ insuranceName+" insurance");
	}
	public abstract void getQuate();
	public abstract void cancelInsurance();

}


class Car extends Insurance{
	String model;
	public Car(String insuranceName, String model) {
		super(insuranceName);
		this.model=model;
		
		
	}

	@Override
	public void getQuate() {
		System.out.println(insuranceName+" has a policy of interest rate of 10%");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" your insurance policy will be rennovated annual");
		
	}
}	

class Health extends Insurance{
	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuate() {
		System.out.println(insuranceName+" has a policy of interest rate of 25%");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" your insurance policy will be renwed annual");
		
	}
}	

class Pet extends Insurance{
	String petType;
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	public void getQuate() {
		System.out.println(insuranceName+" has a policy of interest rate of 30%");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" your insurance policy will be automatically renwed every three months");
		
	}
}	
	
	

