package com.ForHomeworkAndPractice;

import java.security.KeyStore.Entry;
import java.util.*;

class Main{
  public static void main(String[] args) {
    Map<String, String> map=new HashMap<>();
    map.put("ONE","AAA");
    map.put("TWO","BBB");
    map.put("THREE","CCC");
    map.put("FOUR","DDD");
    map.put("FIVE","EEE");
    
    System.out.println("HashMap Before Remove :");
    //System.out.print(map);

    Set<java.util.Map.Entry<String, String>> keys = map.entrySet();
    
     for (java.util.Map.Entry<String, String> entry : keys) 
         {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
		 
		 System.out.println("------------------");
		 System.out.println("HashMap After Remove :");
		 
		 map.remove("ONE", "AAA");
		 
		 map.remove("FOUR", "DDD");
		 
		 for (java.util.Map.Entry<String, String> entry : keys) 
         {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
		 
		    // //Printing Key-value pairs
         
      //   System.out.println("HashMap Before Remove :");
         
      //   Set<Entry<String, String>> keyValueSet = map.entrySet();
         
      //   for (Entry<String, String> entry : keyValueSet) 
      //   {
      //       System.out.println(entry.getKey()+" : "+entry.getValue());
      //   }
         
      //   System.out.println("------------------");
         
      //   //Removes the mapping for the key 'ONE' only if it is currently mapped to 'CCC'
         
      //   map.remove("ONE", "AAA");
         
      //   //Removes the mapping for the key 'FIVE' only if it is currently mapped to 'EEE'
         
      //   map.remove("FOUR", "DDD");
         
      //   System.out.println("HashMap After Remove :");
         
      //   for (Entry<String, String> entry : keyValueSet) 
      //   {
      //       System.out.println(entry.getKey()+" : "+entry.getValue());
      //   }
		 
		
		 
		}

  }
  
