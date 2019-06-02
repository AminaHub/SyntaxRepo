package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TaskRemoveDupsUsingHashSet {

	public static void main(String[] args) {
		//How can you remove all duplicates from ArrayList?
		//List<String> aList=new ArrayList<String>();        
		//aList.add(“John”);       
		//aList.add(“Jane”);       
		//aList.add(“James”);        
		//aList.add(“Jasmine”);        
		//aList.add(“Jane”);        
		//aList.add(“James”);
		
		
		List<String> aList=new ArrayList<String>();
		aList.add("John");       
		aList.add("Jane");       
		aList.add("James");        
		aList.add("Jasmine");        
		aList.add("Jane");        
		aList.add("James");
		
		Set<String> a=new HashSet<>(aList); 
		System.out.println(a);
		
		Set<String> s=new LinkedHashSet<>(aList); 
		System.out.println(s);
		
		Set<String> t=new TreeSet<>(aList); 
		System.out.println(t);
		
	}

}
