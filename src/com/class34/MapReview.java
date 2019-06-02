package com.class34;

import java.util.*;

public class MapReview {

	public static void main(String[] args) {
		//Create a map of grocery products and its quantity
		Map<String,Integer> groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Potato", 2);
		groceryMap.put("Cokies", 3);
		
		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());
		
		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap);
		
		groceryMap.remove("Cheese");
		System.out.println(groceryMap);
		
		//retrieving all keys+values using keySet();
		
//		Set<String> keySet=groceryMap.keySet();
//		for(String key:keySet) {
//			System.out.println("Key is "+key+" and values are "+groceryMap.get(key));
//		}
//		
//		Iterator<String> keyIt=keySet.iterator();
//		while(keyIt.hasNext()) {
//			String key=keyIt.next();
//			System.out.println(key+":"+groceryMap.get(key));
//		}
	
		for(String key :groceryMap.keySet()) {
			System.out.println("Key is "+key+" and values are "+groceryMap.get(key));
			
		}
		Iterator<String> keyIt=groceryMap.keySet().iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}
		
//		Collection<Integer> valCollection=groceryMap.values();
//		for(Integer value:valCollection) {
//			System.out.println(value);
//		}
		
		for(Integer value:groceryMap.values()) {
			System.out.println(value);
		}
		
		Iterator<Integer> valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		//retrieving all keys+values using entrySet();
	
		for(Map.Entry<String, Integer> entry:groceryMap.entrySet()) {
			String mapValue=entry.getKey()+" == "+entry.getValue();
			System.out.println(mapValue);
		}
		
		//String a="Hello"+1
		//map-->using entrySet --> get Set --> any collection has iterator method -->Iterator
		System.out.println();
		Iterator<Map.Entry<String, Integer>> it=groceryMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry=it.next();
			String valueFromMap=entry.getKey()+" and value is "+entry.getValue();
			System.out.println(valueFromMap);
		}
	}

}