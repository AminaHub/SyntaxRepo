package com.Class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;//increments by 
		System.out.println(w);
		
		int v=10;
		v--;//decrement by 1
		System.out.println(v);
		
		
		int a=10;
		int b=++a;//preincrement=first increment -->assign
		
		int c=10; //postincrement= first assign --> incrementfirst increment then assign
		int d=c++;// c was used and then c was incremented
		
		
		
		//int b=a++; //first assign then increment
		
		System.out.println(b);//11
		System.out.println(d);//10
		
		int q=100;
		int e=q--;
		
		System.out.println("value of e is "+e);//100
		System.out.println("value of q is "+q);//99
		
		
		int h=50;
		int g=--h;
		
		System.out.println("value of h is "+h);
		System.out.println("value of g is "+g);

	}

}
