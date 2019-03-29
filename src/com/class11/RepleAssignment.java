package com.class11;

public class RepleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};
//			
//			
//			//Double and print array
//		for(int i=0; i<a.length; i++){
//		  for(int j=0; j<a[i].length; j++){
//		    System.out.print((a[i][j])*2+" ");
//		  }
//	  System.out.println();
////		}
//		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
//	 //should be true
//
	boolean isSquare=true;

//	for(int i=0; i<a.length; i++){
//	  for(int j=0; j<a[i].length; j++){
//	    if(a[i]==a[j]){
//	      
//	      square=true;
//	      
//	    }else {
//	    	square=false;
//	    }
//	    
//	  }
//	}
//		System.out.println(square);

//	  for (int i=0; i<a.length; i++) {  
//		  for (int y=0; y<a[i].length; y++) {    
//			  if(a[i]==a[y]) {    
//				  
//			  }  }} 
//	  System.out.println("true");
//		
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			if(a.length == a[i].length) {
				isSquare = false;
			}//else {
				//isSquare = false;
			//}
		}
	}
	System.out.println(isSquare);
			
	
//	int[][] a = {
//			{1,1,2}, //sum = 4
//			{3,1,2}, //sum = 6
//			{3,5,3}, //sum = 11
//			{0,1,2}  //sum = 3
//		};
//		int rowSum=0;
//		for(int i=0; i<a.length; i++){	
//		  for(int j=0; j<a[i].length; j++){
//		        rowSum+=a[i][j];
//		  }
//		  System.out.println(rowSum);
//		  rowSum=0;
//		  
//		  
//		 }
		//System.out.println(rowSum);
		//System.out.println(rowSum);
		
		
}

}
