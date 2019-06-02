package com.class33;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		Map<String, Integer> classroomMap=new LinkedHashMap<>();
		classroomMap.put("Table", 20);//Entry<Key, value>
		classroomMap.put("Chair", 60);//Entry<String, Integer
		classroomMap.put("Screen", 3);
		classroomMap.put("Instructor", 3);
		
		System.out.println(classroomMap);
		
		System.out.println();
		for(Map.Entry<String, Integer> entry:classroomMap.entrySet()) {
		System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println();
		System.out.println("////////////////////////////////");
		Iterator<Map.Entry<String, Integer>> classRoomIterator=classroomMap.entrySet().iterator();
		while(classRoomIterator.hasNext()) {
			Map.Entry<String, Integer> me=classRoomIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}

	}

}
