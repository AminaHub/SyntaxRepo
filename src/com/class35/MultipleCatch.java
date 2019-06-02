package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Begining of the code");
		try {
			Thread.sleep(2000);//new InterruptedException()
			System.out.println(10/0);//new ArithmeticException()
		}catch (ArithmeticException e) {
			//3 ways to print name and details of an exception
			//e.printStackTrace();//prints name of Exception, detail of E and location
//			System.out.println(e);/ it gives the name of E and Details
			System.out.println(e.getMessage());// will prints only details of the E
			
			System.out.println("Code of Arithmetic Exception catch");
		}catch(InterruptedException e) {
		System.out.println("Code of Arithmetic Exception catch");
		}
		System.out.println("End of the code");
	}

}
