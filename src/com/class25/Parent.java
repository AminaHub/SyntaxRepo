package com.class25;

public class Parent {
	Parent(){
		System.out.println("I am a parent constructor");
	}
}
class Child extends Parent{ // we cannot override a constructor or special method but we can overload
	Child(){
	System.out.println("I am a Child costructor");
	}
}
