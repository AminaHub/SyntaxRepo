package com.class12;

public class Recap {

	public static void main(String[] args) {
		// Create an array of numbers
		
		int [][] arr= {
				{1,2,3},//first array that stored with index 0
				{10,20,30},//2nd array with index 1
				{100,200,300}//3rd array with index 2
		};
		            //how many total arrays
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("-------------For each loop---------------");
		//loop through each element iside 2D array--> each element=array
		for(int[] singleArray:arr) {// it loops through the array inside the big array-That's why the type is int[] array 
			//loop through each single array
			for(int numbers:singleArray) { //it loops through each number of the Array inside the big array that's why the type is just integer number,int numbers
				System.out.print(numbers+" ");
			}
			System.out.println();
		}	
	}

}
