package com.class11;

public class Task {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the Array
		
//		String[] cars= {"Maserati", "Mustang", "Audi", "Tesla", "Ferrari"};
//		
//		for(int i=0; i<=cars.length-1; i++ ) {
//			System.out.println(cars[i]);
//		}
//		
//		System.out.println("--------------Advanced for loop--------------");
//		for(String carsTypes:cars) {
//			System.out.println(carsTypes);
//		}
		
       // Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		
//		String[] countries= {"Iraq", "Turkey", "Italy", "USA"};
//		//String capital;
//		
//		for(int i=0; i<countries.length; i++ ) {
//			
//			if(countries[i].equals("Iraq")) {
//				System.out.println("Bagdad");
//			}else if(countries[i].equals("Turkey")) {
//				System.out.println("Istanbul");
//			}else if(countries[i].equals("Italy")) {
//				System.out.println("Rome");
//			}else if(countries[i].equals("USA")) {
//				System.out.println("DC");
//			}
//			//System.out.print(countries[i]+" "+capital );
//		}
//		
//		System.out.println();
//		
//		String[] countries1= {"Iraq", "Turkey", "Italy", "USA"};
//		
//		for(String country:countries1) {
//		
//		    switch (country) {
//			case "Iraq":
//				System.out.println("Bagdad");
//     			break;
//			case "Turkey":
//				System.out.println("Istanbul");
//				break;
//			case "Italy":
//    			System.out.println("Rome");
//    			break;
//        	case "USA":
//        		System.out.println("DC");
//				break;	
//		    }
//		}   

 
	//}
		//Create an array on integers and calculate the sum of all elements in an array.
	
	//int[] numbers= {1,2,3,4};
	
//	int sum=0;
//	
//	for(int i=0; i<numbers.length; i++) {
//	 sum+=numbers[i];	
//		
//	}
//	System.out.println("the sum of integers is: "+sum);
	
		

//	int sum2=0;
//	//System.out.println();
//	for(int sum1:numbers) {
//		sum2+=sum1;
//	}
//	
//	System.out.println("the sum of integers is: "+sum2);
	
	
	//create an array of integers and find largest number
	
	int[] numbers= {200,20,13,499,65};
	int largest=numbers[0];
	
	for(int i=0; i<numbers.length;i++) {
		if(numbers[i]>largest) {
			largest=numbers[i];
			
		}
		
	}
	System.out.println("The largest number is "+largest);
}

}
