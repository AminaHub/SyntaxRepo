package com.ReviewSession;

public class ClassSix2DArraysStrings {

	public static void main(String[] args) {
		//raget arrays: int[][] arr={{1,2,3},
		//							{3,4},
		//                          {5,6,9},
		//                         };
		
		//Write a program to print the length of each array
		
		int[][] ar= {
				{1,2,3,},
				{4,5,6,9},
				{7,8}
		};
		
		//using for loop
		//int length=0;
		for (int i=0; i<ar.length; i++) {
			System.out.println("The length of row "+(i+1)+ " = "+ar[i].length);
			
		}
		//using for each
		
		for(int[] inner:ar) {
			System.out.println("The length of row = "+inner.length);
		}

		
		//Write a program to Print all elements of the 2d array using a for loop
		
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		//using for each loop
		for(int[] inn: ar) {
			for(int elements: inn) {
				System.out.print(elements +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int [][] rating = {{2,6,9,3,7},{1,7,9,4,8},{0,4,6,2,5},{0,1,2,3}};
				
		double average=0.0; // we don't need to declare one extra variable
		double sum=0.0;
		
		for (int i=0; i<rating[1].length; i++) {
			sum+=rating[1][i];
			//average= sum/rating[1].length; I don't need to loop average in the loop
		}
		average=sum/5;
		System.out.println("The sum of the second row of arrays is "+average);
		
	    //System.out.println("The sum of the second row of arrays is "+sum/5);
		
		System.out.println();
		//find the number of values above the value of 7
		int [][] r = {	{2,6,9,3,7},
						{1,7,9,4,8},
						{0,4,6,2,5},
						{0,1,2,3}};
		
		int num=0;
		for (int i=0; i<r.length; i++) {
			for(int j=0; j<r[i].length; j++) {
				
				if(r[i][j]>7) {
					num+=1;
					
				}
				
			}
			
		}
		System.out.println("number of values above 7: "+num);
		
		
		//using for each loop
		int count =0;
		
		for(int[] inner:r) {
			for(int element:inner) {
				if(element>7) {
					count++;
				}
			}
		}
		System.out.println("The number of all elements above 7 is "+ count);
		
		
		//Print the average of values in column 3;
		
		System.out.println();
		double suma=0;
		for (int i=0; i<r.length; i++) {
			//for(int j=0; j<r[2].length; j++) {
			suma += r[i][2];
			
		}
		System.out.println("the avargae of the 3rd column  "+ (suma/rating.length));
		
		
		//Strings
		
		String str="Hello";
		str = new String("Hello");
		
		
		
		
		
		
	}

}
