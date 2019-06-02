package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		Set<String> classDays=new HashSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturda");
		classDays.add("Sunday");
		
		Set<String> classDays1=new LinkedHashSet<>();
		classDays1.add("Tuesday");
		classDays1.add("Wednesday");
		classDays1.add("Thursday");
		classDays1.add("Saturday");
		classDays1.add("Sunday");
		
		Set<String> classDays2=new TreeSet<>();
		classDays2.add("Tuesday");
		classDays2.add("Wednesday");
		classDays2.add("Thursday");
		classDays2.add("Saturday");
		classDays2.add("Sunday");

		System.out.println("------Hash Set-----");
		System.out.println(classDays);
		System.out.println();
		System.out.println("--------Linked HashSet--------");
		System.out.println(classDays1);
		System.out.println();
		System.out.println("--------Tree Set--------");
		System.out.println(classDays2);
		System.out.println();
		
		System.out.println("--------Tree Set--------");
		
		for(String days:classDays) {
			System.out.println(days);
		}
		System.out.println("----------------");
		
		Iterator<String>it=classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
