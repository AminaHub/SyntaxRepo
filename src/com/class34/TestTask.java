package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestTask {

	public static void main(String[] args) {
		// Create a map in which we will store the carNumber and car object
		
		Person user1=new Person("John", "Smith", 20, 20000);
		Person user2=new Person("James", "White", 25, 50000);
		Person user3=new Person("Amber", "Mark", 35, 600000);
		
		user1.printUserDetails();
		user2.printUserDetails();
		user3.printUserDetails();
		
		Map<Integer, Person> userMap=new HashMap<>();
//		carMap.put(1, car1);
//		carMap.put(1, car2);
//		carMap.put(1, car3);
		
		userMap.put(2, new Person("Anna", "Smith", 39, 100000));
		userMap.put(3, new Person("Mark", "Yeger", 40, 500000));
		
		Collection<Person> userValues=userMap.values();
		for(Person p:userValues) {
			p.printUserDetails();
		}

	}

}
