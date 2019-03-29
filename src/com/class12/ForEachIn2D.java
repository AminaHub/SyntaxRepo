package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/* create a grocery list: fruits{}
		 * Vegies{}
		 * dairy{}
		 * Retrieve all values using 2 different loops
		 */
		
		String [][] food= {
				{"Apple","Banana","Oranges"},
				{"Carrots","Lettuce","Zucchini"},
				{"Milk","Cheese","Butter"}
		};
		            
		for(int i=0;i<food.length; i++) {
			for(int j=0;j<food[i].length; j++) {
				System.out.print(food[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("-------------For each loop---------------");
		for(String[] items:food) { 
			for(String foodList:items) { 
				System.out.print(foodList+" ");
			}
			System.out.println();
		}	
			
		}

	

}
