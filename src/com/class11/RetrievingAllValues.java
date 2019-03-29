package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    int[][] num= {
//		 {11,12,13,14},
//		 {21,22,23,24},
//		 {31,32,33,34},
//     };
//    int rows=num.length;
//    System.out.println(rows);
//    
//    int cols=num[0].length;  //columns have dependency on rows. to find the length of the column we need to go inside the row
//    System.out.println(cols);
//    
//    for(int row=0; row<num.length; row++) {
//    	for(int col=0; col<num[row].length; col++) {
//    		System.out.print(num[row][col]+" ");
//    	}
//    	System.out.println();
//    }
//    
    String[][] food= {
    		{"burger","fries","hot dog","meatloaf"},  //first array or 1st row
    		{"lo mein","fried rice"},
    		{"biriyani","korma","naan","chick peas"}
    		
    };
    
     for(int i=0; i<food.length; i++) {
    	 for(int j=0;j<food[i].length; j++) {
    		 System.out.print(food[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}

}
