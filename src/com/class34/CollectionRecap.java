package com.class34;

import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
		//List<String> list=new List<>()//we cannot creat a list object because List is an interface
		List<String> list=new LinkedList<>();
		list.add("Java");
		list.add("is");
		list.add("fun");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		Set<String> set=new TreeSet<>();
		set.add("java");
		set.add("is");
		set.add("fun");
		set.add("and");
		set.add("logic based");
		
		
		System.out.println(set);
		//System.out.println(list.get(2));
		
		Map<Integer, String> map=new TreeMap<>();
		map.put(1,  "A");
		map.put(2,  "B");
		map.put(3,  "C");
		map.put(4,  "D");
		//map.put(null,  "E");
		map.put(5,  null);
		map.put(4,  "E");
		
		System.out.println(map);
	
	Map<String, Integer> map1=new Hashtable<>();
	map1.put("1", 2);
	//map1.put(null, 3);
	map1.put("A", 2);
	
	System.out.println(map1);
	
	}	

}
