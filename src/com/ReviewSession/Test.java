package com.ReviewSession;


import java.util.HashMap;
import java.util.Map;

public class Test {    
	public static void main(String[] args) {       
		Map<String, Marketing> sales = new HashMap<String, Marketing>();        
		sales.put("Joe", new Marketing("Joe", "Shoes", 2000.00));        
		sales.put("Smith", new Marketing("Smith", "Shoes", 4000.00));        
		sales.put("Adam", new Marketing("Adam", "Shoes", 6000.00));        
		sales.put("Tiffany", new Marketing("Tiffany", "Shoes", 7000.00));        
		sales.put("Aloha", new Marketing("Aloha", "Shoes", 1000.00));        
		sales.put("Sam", new Marketing("Sam", "Shoes", 10000.00));        
		sales.put("Mustafa", new Marketing("Mustafa", "Shoes", 50000.00));        
		sales.put("Kelda", new Marketing("Kelda", "Shoes", 3000.00));        
		
		for (String key : sales.keySet()) {            
			Marketing m = sales.get(key);           
			if (m.getSaleAmount() > 3000)                
				System.out.println(m.toString());        
			}    
		}
	}