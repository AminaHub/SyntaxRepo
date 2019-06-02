package com.class30;

import java.util.ArrayList;

public class TaskArrayList {
	//Create a generic ArrayList that will store 5 names into it.
	//Find out whether the given ArrayList is empty or not?
	//Check whether the specific name is present in an ArrayList or not?
	//Find the size of your arrayList and print all values from that
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Myhri");
		name.add("Olga");
		name.add("Tatiana");
		name.add("Amina");
		name.add("Mek");
		
		System.out.println(name.isEmpty());
		System.out.println(name.contains("Amina"));
		System.out.println(name.size());
		
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i));
			
		//non generic arraylist-we can store different types of objects
		ArrayList alist=new ArrayList();
		alist.add("String");//String
		alist.add(100);//integer
		alist.add(100.10);//double
		alist.add(true);//boolean
		alist.add('A');//char
		
		for(Object value:alist) {
			
			System.out.println(value);
		}
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}
		
		}
		}
		

	}


