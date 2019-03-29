package com.Class6;

import java.util.Scanner;

public class HomeWorkSix {

	public static void main(String[] args) {

	String eligible;
	int score;
	boolean loan;

	Scanner input=new Scanner (System.in);
	System.out.println("Do you need a loan?");

	loan=input.nextBoolean();

	if (loan){
	  System.out.println("What is your credit score?");
	  score=input.nextInt();
	  
	  if (score<600){
	    eligible="Not elegible";
	  }else if(score>=600 && score<=700){
	    eligible="Maybe eligible";
	  }else if(score>=701 && score<=800){
	    eligible="Eligible";
	  }else {
	    eligible="Definitely eligible";
	  }
	 //System.out.println("The eligibility is "+eligible);
    }else {
    	eligible="Uknown";
    }
	System.out.println("The eligibility is "+eligible);
	}	

}
