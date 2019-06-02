package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Honda");
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		//2 way using advanced for loop
		
		System.out.println("-----------Using for each loop-----------");
		for( String car:cars) {// same as for(Object num:Numbers){}
			System.out.println(car);
		}

		//3 way using iterator
		System.out.println("-----------Using iterator-----------");
		Iterator<String> it=cars.iterator();
		//hasNext(); next(); remove()
		while(it.hasNext()) {
			// number=it.next();
			System.out.println(it.next());
		}
//		
//		//4 way using while loop
		System.out.println("-----------Using while loop-----------");
		int c=0;
		while(cars.size()>c) {
			//int myCar=cars.get(c);
			System.out.println(cars.get(c));
			c++;
		}
		
		}

	}


