package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
	//3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		alist.add("Juice");
		alist.add("water");
		alist.add("coke");

		System.out.println(alist);
		//Iterator<String> iterator = alist.iterator();
		for(int i=0; i<alist.size(); i++) {
			String drink=alist.get(i);
			if(drink.contains("a") || drink.contains("e")) {
				drink=alist.set(i,"water");
			}	
		}
		System.out.println(alist);

	}

	}


