package com.class22;

public class ConstructorTypes {
	
	 	ConstructorTypes(){
	 		System.out.println("I am a constructor with no parameters");
	 	}
	    
	    ConstructorTypes(String str){//str - is a local variable to a constructor
	        System.out.println("I am a constructor with 1 parameter "+str);
	    }
	    
	    ConstructorTypes(int a, String str){
	        System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
	    }
	    

	public static void main(String[] args) {
		// if you don't create any constructor -->compiler will create one default constructor for you
		//but if you create a constructor compiler will not create any for you
		ConstructorTypes obj1=new ConstructorTypes();
		ConstructorTypes obj2=new ConstructorTypes("String");
		ConstructorTypes obj3=new ConstructorTypes(123, "String");
		

	}

}
