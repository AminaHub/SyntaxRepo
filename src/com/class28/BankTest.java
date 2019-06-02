package com.class28;

public class BankTest {

	public static void main(String[] args) {
		Bank bank=new BOA();
		bank.openBrowser();
		bank.hasCreditCards();
		bank.hasSavings();
		System.out.println(Bank.hello);

	}

}
