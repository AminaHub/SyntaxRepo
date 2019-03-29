package com.class10;

public class GetAll {

	public static void main(String[] args) {
		String[] names= {"John","Mike","Jane","Talget","Olga","Mehmet","Siyar"};
		int a=3;
		System.out.println(names[a]);//Talgat
		a+=2;
		System.out.println(names[a]);//Mehmet
		a-=4;
		System.out.println(names[a]);//Mike
		
		int size=names.length;
		
		System.out.println(size);
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
//		System.out.println(names[5]);
//		System.out.println(names[6]);
		
		for(int i=0; i<size; i++) {
			System.out.println(names[i]);
		}
		

	}

}
