package com.Class17_2.copy;

public class Clock {

	public static void main(String[] args) {
		
		Clock obj=new Clock();
		
		obj.clockTime();

	}
	
	void clockTime() {
		// 24bhours, 60 minutes
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(m<=9) {
				  System.out.println(h+":0"+m);
			    }else {
			    	System.out.println(h+":"+m);
				}
			}
		}
	}

}
