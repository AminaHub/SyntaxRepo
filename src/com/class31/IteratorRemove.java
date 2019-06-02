package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		// let's create an arrayList of integers from 1-10
		//remove all odds using iterator
		
		ArrayList<Integer> alist=new ArrayList<>();
//		alist.add(1);
//		alist.add(2);
//		alist.add(3);
		
		for(int i=1; i<=20; i++) {
			alist.add(i);
		}
		
		System.out.println(alist);
		Iterator<Integer> iterator = alist.iterator();
		while(iterator.hasNext()) {//checks if the collection(alist) has any elements
			int number=iterator.next();//goto the next element
			if(number%2!=0) {//check if it is an odd number
				iterator.remove();//if odd is true then remove from the list
			}
		}
		System.out.println(alist);

	}

}
