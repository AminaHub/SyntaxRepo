package com.Class5;

public class LogicalOperators {

	public static void main(String[] args) {
		/* If number is between 1-10 --> number is small
		*if number is between 11-100 --> number is medium
		*if number is between 101-100-->number is large
		*/
		int num=15;
		//true AND False -->false
		if(num>=1 && num<=10) {
			System.out.println("number is small");
		//true AND true -->true
		}else if(num>=11 && num<=100) {
			System.out.println("nummber is medium");
		//false AND true-->false
		}else if (num>=101 && num<=1000) {
			System.out.println("number is large");
		}else {
			System.out.println("Number is not in our range");
		}
	}

}
