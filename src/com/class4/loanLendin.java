package com.class4;

import java.util.Scanner;

public class loanLendin {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 * IF LOAN IS LESS THAN 200,000 THEN YOUWOULD LEND THE MONEY
		 * otherwise you would reject he client
		 */
		int loan;
		Scanner myScan=new Scanner(System.in);
		
		System.out.println("What is the amount of loan is needed");
		loan=myScan.nextInt();
		if (loan<200000) {
			System.out.println("Loan accepted");
		}else {
			System.out.println("Loan rejected");
		}
		

	}

}
