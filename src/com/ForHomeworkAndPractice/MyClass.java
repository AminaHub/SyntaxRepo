package com.ForHomeworkAndPractice;

public class MyClass {
	String str ="";
	String str2 ="";
	MyClass(){
		this("z");
		System.out.println(str+str2);
	}
	MyClass(String str){
		this("x","y");
		//System.out.println("Str and Str2 values "+str+" "+str2);
		this.str +=str;
		//System.out.println("Str value "+str);
		System.out.println(this.str+str2);
		System.out.println("this.str "+this.str);
		//System.out.println("Const with one arg "+str+" "+str2);
	}
	MyClass(String str, String str2){
		this.str+=str;
		this.str2+=str2;
		System.out.println(this.str+this.str2);;
	}
	public static void main(String[] args) {
		MyClass mc=new MyClass();
		
		// TODO Auto-generated method stub

	}

}
