package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		int[] intArray= {10,21,34};
		String[] stringArray= {"Hello", "Bye"};
		
		//Can we place Object into Array
		Visa visa1=new Visa("Visa Platinum");
		Visa visa2=new Visa("Visa Platinum");
		Visa visa3=new Visa("Visa Platinum");
		
		AmericanExpress ax=new AmericanExpress("AX REwards");
		AmericanExpress ax1=new AmericanExpress("AX REwards");
		AmericanExpress ax2=new AmericanExpress("AX REwards");
		
		CreditCard[] visaArray= {visa1, visa2, visa3, ax, ax1, ax2};
		//array of objects
		Object[] objectArray= {visa1, ax1, "John", 67, true, 90.08};

	}

}
