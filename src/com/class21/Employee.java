package com.class21;

public class Employee {
	public String eID;
	public int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		//Create a Class called Employee:
		//Create three  variables  eID , salary 
		//and set the CEO to “Sumair”
		//Create two objects of the class Employee
		//Set the value of eID, salary for each of the objects
		//Print out the eID , salary and  CEO for each of the objects
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.eID="12345";
		e1.salary=60000;
		e2.eID="23789";
		e2.salary=70000;
		
		System.out.println("Employee ID: "+e1.eID + " Salary: "+e1.salary+" CEO: " + e1.CEO);
		System.out.println("Employee ID: "+e2.eID +" Salary: "+ e2.salary+" CEO: " + e2.CEO);
		

	}

}
