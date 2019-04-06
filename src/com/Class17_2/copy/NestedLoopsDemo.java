package com.Class17_2.copy;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedLoopsDemo demo=new NestedLoopsDemo();
		
//		for(int i=1; i<=3; i++) {
//			for(int y=1; y<=3; y++) {
//				System.out.println(i+" "+y);//11;12;13//21;22;23//31;32;33
//			}
//		}
     
		demo.printNumbers();
		
	}
	
	void printNumbers() {
		
		for(int i=1; i<=2; i++) {
			for(int y=1; y<=3; y++) {
				System.out.println(i+" "+y);//11;12;13//21;22;23//31;32;33
			}
		}
		
	}

}
