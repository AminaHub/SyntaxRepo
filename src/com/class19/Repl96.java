package com.class19;

public class Repl96 {
	
	//public static void main(String[] args) {
		
	
//    { 
//        String s1 = "12345"; 
//        String s2 = "abcde"; 
//        System.out.println(merge(s1, s2)); 
//    } 
//  
    // function for merging two strings 
    //public static String merge(String s1, String s2) 
    //{ 
//        StringBuilder finalString = new StringBuilder(); 
//  
//        /*append character to final string from the two strings */
//        int i = 0, j = 0; 
//        while (i < s1.length() && j < s2.length()) { 
//  
//            finalString.append(s1.charAt(i++)); 
//            finalString.append(s2.charAt(j++)); 
//        } 
//  
//        /* check if both the strings are traversed and 
//           if not then append remainder of that string  
//           to the final string */
//        if (i != s1.length()) { 
//            finalString.append(s1.substring(i)); 
//        } 
//        if (j != s2.length()) { 
//            finalString.append(s2.substring(j)); 
//        } 
//        return finalString.toString(); 
//    } 
//} 
	
	
	
//	String mixString(String s1, String s2)	{
//		  String a="";
//		  for (int i = 0; i < s1.length(); i++) {
//	            for (int j = i; j < s2.length(); j++) {
//	                a=s1.charAt(i) + "" + s2.charAt(j);
//	                System.out.print(a);
//	                break;
//	            }
//	    }
//	    return (a=" ");
//			
//		}
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//		  Repl96 obj=new Repl96();
//			System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
//			System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
//		}
	
public static void main(String[] args) {

        String s1 = "13579"; 
        String s2 = "hello";
        for (int i = 0; i < s1.length(); i++) {
                 System.out.print(s1.substring(i, i+1) + s2.substring(i, i+1));
             
    }

}
}
