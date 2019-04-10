package com.class20;

public class UserAccess {

	public static void main(String[] args) {
		// public-access to all classes in the entire worl(project)
		//protected- access to all classes in the same package
		//default - access to all classes in same package
		//private - access within same class Only
		
		//Syntax for Methods
		//  optional       optional         mandatory   mandatory   optional
		//AccessModifier nonAccessModifier returnType methodName(parameterList){
			//MethodBody;
		//}
		
		//Syntax for variables
		//Optional        optional          must     must
		//AccessModifier nonAccessModifier dataType name
		
	UserAccess obj=new UserAccess();
	System.out.println(obj.reverse("amina"));
	obj.palindrome("DADA");

	}
	
	String reverse(String str) {

          String reverse="";
           for (int j = str.length()-1; j >=0; j--) {
        	   reverse = reverse+ str.charAt(j);
           }
           
         return  reverse= reverse+" " ;
           
     }
		
	public String palindrome (String str) {
		
		String pReverse1="";
		for(int i=str.length()-1; i>=0; i--) {
			pReverse1=pReverse1+str.charAt(i);
		}	
			//System.out.println(pReverse1);
			if(str.equalsIgnoreCase(pReverse1)) { 
				
				System.out.println(str+" is a Palindrome word");
				
			}else {
				System.out.println(str+ " is not a Palindrome word");
			}
			return pReverse1;
	}
	

}
