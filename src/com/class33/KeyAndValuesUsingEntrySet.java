package com.class33;

import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		// Create a map to store userDetails(name, salary, department, title)
		
		Map<String, String> userDetailsMap=new LinkedHashMap<>();
		userDetailsMap.put("Name","Alex Smith");
		userDetailsMap.put("Salary","90000");
		userDetailsMap.put("Department","IT");
		userDetailsMap.put("Title","Automation Tester");
		
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();//return a set of entries
		
		
		for(Map.Entry<String,String> entry:userDetailsMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue()); //we can concatnaite the two
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("Using Iterator------------------------------------");
		Iterator <Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
