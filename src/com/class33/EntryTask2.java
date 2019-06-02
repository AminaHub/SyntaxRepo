package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntryTask2 {

	public static void main(String[] args) {
		// Create a map of Best Buy store. 
		//Placeitem id and item name into it. 
		//Example (7664847 = Printer, 7879885= TV etc)
		//Print all keys and values from a Best Buy map using EntrySet.
		
		Map<String, Integer> bestBuy=new LinkedHashMap<>();
		bestBuy.put("Computers", 7879885);//Entry<Key, value>
		bestBuy.put("TVs", 7664847);//Entry<String, Integer
		bestBuy.put("LabTops",67879885);
		bestBuy.put("CellPhones", 7879890);
		
		System.out.println(bestBuy);
		
		System.out.println();
		for(Map.Entry<String, Integer> entry:bestBuy.entrySet()) {
		System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println();
		System.out.println("////////////////////////////////");
		Iterator<Map.Entry<String, Integer>> bestBuyIterator=bestBuy.entrySet().iterator();
		while(bestBuyIterator.hasNext()) {
			Map.Entry<String, Integer> me=bestBuyIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}

	}

}
