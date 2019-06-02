package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Myhri");
		names.add("Olga");
		names.add("Tatiana");
		names.add("Amina");
		names.add("Mek");
		
		//1 way using for loop
		System.out.println("-------1 way using for loop-------");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//2 way using advance for loop
		
		System.out.println("-------2nd way using for loop-------");
		for(Object name:names) {
			System.out.println(name);
		}
		
		System.out.println("-------3rd way using Iterator method-------");
		Iterator<String> it=names.listIterator();
		//boolean check=it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
