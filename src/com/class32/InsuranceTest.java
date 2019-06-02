package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
			Car car=new Car("Gieco","Toyota");
			Health health=new Health("United HealthCare");
			Pet pet=new Pet("Sunrise Insurance", "Dog");
			
			ArrayList<Insurance> alist=new ArrayList<>();
			alist.add(car);
			alist.add(health);
			alist.add(pet);
			
			//how can I get a name of each card
			
			for(Insurance insu:alist) {
				System.out.println(insu.insuranceName);
				insu.getQuate();
				insu.cancelInsurance();
				System.out.println("-----------");
			}
			System.out.println("-----------");
			//how can we print and interest rate of each class
			
			Iterator <Insurance> myIterator=alist.iterator();
			while(myIterator.hasNext()){
				Insurance obj=myIterator.next();
				obj.getQuate();
			}
			System.out.println("-----------");
			//how to print an annual fee of each card
			for (int i=0; i<alist.size(); i++) {
				Insurance obj=alist.get(i);
				obj.cancelInsurance();
			}
			

		}


	}


