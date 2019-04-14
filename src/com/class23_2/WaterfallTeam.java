package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee {
	
	public static void main (String[] args) {
		WaterfallTeam wt=new WaterfallTeam();
		wt.salary1=90000;     //protected variables and methods can be accessed from a different package if the child lives in different package 
		//Protected members (variables and methods) values can accessed from different package through inheritance only
		//default values cannot be access in different package
		
		wt.test();//available because is protected 
		//wt.test1(); //Not available cause it is default
	}

}
