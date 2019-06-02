package com.class33;

import java.util.*;

public class TaskMap {

	public static void main(String[] args) {
		Map<Integer, String> countries=new HashMap<>();
		countries.put(1, "Baghdad");
		countries.put(2, "Rome");
		countries.put(3, "Istanbul");
		countries.put(4, "Washington DC");
		countries.put(5, "Ottawa");
		
		Set<Integer> keys=countries.keySet();
		System.out.println("----------Using for each loop-----------");
		for(Integer key:keys) {
			//System.out.println(key+":"+countries.get(key)); it will print the key with its value
			System.out.println(key);
		}
		
		System.out.println("----------Using Iterator-----------");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			Integer key=keysIt.next();
			//System.out.println(key+":"+countries.get(key));It will print the key with its value
			System.out.println(key);
		}
		
		Collection<String>valCol=countries.values();
		System.out.println("----------Using for each loop-----------");
		for(String value: valCol) {
			System.out.print(value+", ");
		}
		
		System.out.println();
		System.out.println("----------Using Iterator-----------");
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+", ");
		}


	}

}
