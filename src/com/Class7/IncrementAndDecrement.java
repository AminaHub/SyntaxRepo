package com.Class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//Post increment & post decrement
		//a++              a--
		
		
		int x=10;
		int y=x;
		System.out.println(x+" "+y);
		
		//Pos increment a++;
		int a=299;
		int b=a++;//first assign then increment (int=a; a=a+1)
		System.out.println(a);//300
		System.out.println(b);//299
		
		//post decrement x--;
	
		int z=10;
		int c=z--;
		System.out.println(z);//9
		System.out.println(c);//10
		
				
	}

}
