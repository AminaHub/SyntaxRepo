package com.class28;

public interface Bank {
	
	
	static String name="Bank"; //by default all variables inside the interface are public static final
	//By default compiler adds public & abstract to every method
	String hello="hi";//by default it will be public static final
	void hasChecking();
	void hasSavings();
	void hasCreditCards();
	//static void hasLoan(); cannot have abstract static methods
	
	

}

class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 3 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 3 checking accounts");
		
	}

	@Override
	public void hasCreditCards() {
		System.out.println("BOA has 10 diferent CC");
		
	}
	
}
