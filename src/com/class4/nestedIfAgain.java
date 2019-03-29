package com.class4;

public class nestedIfAgain {

	public static void main(String[] args) {
		/*
		 * Declare variable for gpa and having a diploma
		 * If user has a diploma --> congratulation-->if GPA is heigher than 3.5 --> hire the person
		 * else do not hire
		 */
		
		double gpa=3.6;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulation");
			if(gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately, we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}
	}

}
