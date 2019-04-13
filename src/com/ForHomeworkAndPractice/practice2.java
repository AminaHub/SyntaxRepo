package com.ForHomeworkAndPractice;

public class practice2 {
	
		String mixString(String s1, String s2)	{
		  
				  String a="";
				  for (int i = 0; i < s1.length(); i++) {
			            for (int j = i; j < s2.length(); j++) {
			                a=a+s1.charAt(i) + s2.charAt(j);
			                //System.out.print(a);
			                break;
			            }
			    }
			    return (a);
					
				                  
		} 

		  //test case below (dont change):  
		  public static void main(String[] args){
		    practice2 obj=new practice2();            
		    System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e            
		    System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo  
		  }
		}


