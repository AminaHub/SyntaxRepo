package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		int stringLength=str.length();//int stringLength=5
		System.out.println(stringLength);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		//Stringstr=obj.askHowAreYou("Asel");
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
		int largest1a=obj.largest1(20, 10);
		
		boolean isOdd;
		if(largest1a%2==0) {
			isOdd=false;
			
		}else {
			isOdd=true;
		}
		System.out.println(isOdd);
		

	}
	
	void askHowAreYou(String name) {//parameter
		System.out.println("How Are You "+name);
	}
	
	String whatIsADay() {
		return "Thursday";
	}
	
	void largest(int a, int b) {
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(a+" is smaller than "+b);
		}
	}
	
	int largest1(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
