package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	
	//2.Create an arrayList of words. Remove every word that ends with “e”.

	public static void main(String[] args) {
	
		ArrayList<String> alist=new ArrayList<>();
		alist.add("Apple");
		alist.add("Orange");
		alist.add("Lemon");
		
//		for(int i=1; i<=20; i++) {
//			alist.add(i);
//		}
//		
		System.out.println(alist);
		Iterator<String> iterator = alist.iterator();
		while(iterator.hasNext()) {//checks if the collection(alist) has any elements
			//System.out.println(alist);
			String word=iterator.next();//goto the next element
			if(word.endsWith("e")) {//check if it is an odd number
				iterator.remove();//if odd is true then remove from the list
			}
		}
		System.out.println(alist);

	}


	}


