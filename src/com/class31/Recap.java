package com.class31;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int[] array= {10,10,20,30};
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);//comes from collection
		numbers.add(0, 13);//specific to all list objects
		numbers.add(0,14);//this will shift 13 and will replace it with 14
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		numbers.set(1,  33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		//1. way using for loop
		System.out.println("-----------Using for loop-----------");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//2 way using advanced for loop
		
		System.out.println("-----------Using for each loop-----------");
		for(int num:numbers) {// same as for(Object num:Numbers){}
			System.out.println(num);
		}
		
		//3 way using iterator
		System.out.println("-----------Using iterator-----------");
		Iterator<Integer> it=numbers.iterator();
		//hasNext(); next(); remove()
		while(it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		
		//4 way using while loop
		System.out.println("-----------Using while loop-----------");
		int c=0;
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}

	}

}
