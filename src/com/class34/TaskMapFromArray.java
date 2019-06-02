package com.class34;

import java.util.*;
import java.util.Map.Entry;

public class TaskMapFromArray {
	
	//1.Create a Map from array of cities that will sort keys in alphabetical order. 
	//As a key store the name of the city and as a value store the length of the city name 
	//(Example: Paris=5, Moscow =6 etc..).
	//If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).
	

	public static void main(String[] args) {
String[] cityArray= {"Moscow", "Rome", "Paris","Barcelona", "Istanbul"};
		
		Map<String, Integer> cityMap=new TreeMap<>();
		int key=1;
		for(String city:cityArray) {
			key=city.length();
			cityMap.put(city, key);
			
		}
		System.out.println(cityMap);
		//print key and values using entrySet (loop && iterator)
		
//		for(Map.Entry<String, Integer> entry:cityMap.entrySet()) {
//			String mapValue=entry.getKey()+" is "+entry.getValue();
//			System.out.println(mapValue);
//		}
		
		Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry <String, Integer> entry=it.next();
			//String valueFromMap="Key is "+entry.getKey()+" and value is "+entry.getValue();
			if(entry.getValue()>7) {
				it.remove();
			}
			
		}
		System.out.println(cityMap);
 
	}


	}


//Teacher's solutions

//String[] cityArray= {"London", "Moscow", "Baku", "Berlin", "Istanbul", "Islamabad"};
//
//Map<String, Integer> cityMap=new TreeMap<>();
//
//for (String city: cityArray) {
//	cityMap.put(city, city.length());
//}
//System.out.println(cityMap);
//
//Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
//while(it.hasNext()) {
////	Map.Entry<String,Integer> entry=it.next();
////	if(entry.getValue()>7){
////		it.remove();
////	}
////	int num=it.next().getValue();
////	if (num>7) {
////		it.remove();
////	}
//	String key=it.next().getKey();
//	if (key.length()>7){
//		it.remove();
//	}
//}
//System.out.println(cityMap);
//}
//}


