package com.class19;

public class Calculator {
	//let's create a class called Calculator
	//Have methods that take three inputs and return the results
	
	
	int sum(int a, int b, int c) {
		int sum=a+b+c; //teachers answer return(a+b+c)
		return sum;
		
	}


	int avg(int a, int b, int c) {
		int sum=a+b+c; //teachers answers return (a+b+c)/3
		sum=sum/3;
		return sum;
		
	}
	
	int min(int a, int b, int c) {
		int min = 0;
		if(a<b && a<c) {
				min=a;
			}
		return min;
//teachers answer
//      int min=a;
//		if(b<a) {
//			min=b;
//		}
//		if(c<min) {
//			min=c;
//		}
//		return c;
	
	}
	
	 int max(int a, int b, int c) {
		int max =0;        
		//int min = y[0];                
			if (a>b && a>c) {    
				max=a;     
			}else if(b>a && b>c) {
				max=b;
			}else if(c>a && c>b) {
				max=c;
			}
       
		
		return max;
		
		//teachers solution
//		int max=a;
//		if(b>a) {
//			max=b;
//		}
//		if(c>max) {
//			max=c;
//		}
		//return c;
	}
}
