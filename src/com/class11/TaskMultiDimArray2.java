package com.class11;

public class TaskMultiDimArray2 {

	public static void main(String[] args) {
		// Create an array of cars: american cars, german cars, korean cars, italian cars. 
		//Then retrieve all values from that array
		
		String[][] cars= {
				{"Ford","Chevy","Subaru"},
				{"Volvo","Audi","Benz"},
				{"Kia"},
				{"Fiat","Ferrari","Alfa Romeo"  }
		};	
		for(int i=0; i<cars.length; i++) {
	    	 for(int j=0;j<cars[i].length; j++) {
	    		 System.out.print(cars[i][j]+" ");
	    	 }
	    	 System.out.println();
	    		 
	     }
		
		//Create an array of countries: north america countries,
	    //south america countries, europe countries, aisan countries, african countries, then print all values from that array

		System.out.println();
		
		String[][] countries= {
				{"Canada","America","Mexico"},
				{"Argentina","Chile","Guatimala"},
				{"Spain","Italy","France"},
				{"China","Korea"},
				{"Sudan","Eigypt","Marocco"  }
		};	
		for(int i=0; i<countries.length; i++) {
	    	 for(int j=0;j<countries[i].length; j++) {
	    		 System.out.print(countries[i][j]+" ");
	    	 }
	    	 System.out.println();
	    		 
	     }
	
	}
		
		
		
	

}
