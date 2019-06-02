package com.class34;

import java.util.*;

public class MapFromArray {

	public static void main(String[] args) {
						//  1        2       3       4       5       6
		String[] names= {"Mehmet", "Asha", "Amina","Omar", "Siya","Danny"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		//print key and values using entrySet (loop && iterator)
		
		for(Map.Entry<Integer, String> entry:nameMap.entrySet()) {
			String mapValue=entry.getKey()+" is "+entry.getValue();
			System.out.println(mapValue);
		}
		
		Iterator<Map.Entry<Integer, String>> it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry <Integer, String> entry=it.next();
			String valueFromMap="Key is "+entry.getKey()+" and value is "+entry.getValue();
			System.out.println(valueFromMap);
		}
 
	}

}
