package com.class33;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		Map<Integer, String> building=new HashMap<>();
		//add keys and values
		building.put(101, "Google");
		building.put(102, "Syntax");
		building.put(103, "Apple");
		building.put(104, "Dell");
		building.put(104, "Syntax");
		building.put(105, "Tesla");
		building.put(106, "Ferrari");
		
		System.out.println(building.size());
		building.replace(104, "BOA");
		System.out.println(building.get(104));
		building.remove(104, "Dell");
		//building.remove(104);// will remove both entries with 104 key
		System.out.println(building);
		building.remove(104, "Syntax");
		building.put(107, "Toyota");
		System.out.println(building);

	}

}
