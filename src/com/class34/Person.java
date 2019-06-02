package com.class34;

public class Person {
	
			// Create a Person class with following private fields: 
			//name, lastName, age, salary.Variables should be initialized through constructor.
			//Inside the class also create a method to print user details.
			//In Test Class create a Map to store personId and a Person Object. Print each object details.

		private String name;
		private String lastName;
		private int age;
		private int salary;
		
		Person(String name1, String lastName1, int age1, int salary1){
			this.name=name1;
			this.lastName=lastName1;
			this.age=age1;
			this.salary=salary1;
			
		}
		public void printUserDetails() {//if you declare a method static you can only access only static variables
			 System.out.println("name: "+name+" last name: "+lastName+" age: "+age+" Salary "+salary);
		 }
}


