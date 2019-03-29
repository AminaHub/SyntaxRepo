package com.Class6;
	
import java.util.Scanner;

public class Assignment6 {
 
  public static void main (String[] args){
  
  int num1;
  int num2;
  
  String word1;
  String word2;
  
  Scanner input=new Scanner (System.in);
  
  System.out.println("Please enter two strings");
  
  word1=input.nextLine();
  word2=input.nextLine();
  
  //System.out.println(word1+" "+word2);
  
  System.out.println("Please enter two numbers");
  
  num1=input.nextInt();
  num2=input.nextInt();
  
  //System.out.println(num1+" "+num2);
  
  if(word1.equals(word2) && num1==num2){
    
    System.out.println("AND");
    
  }else if(word1.equals(word2)||num1==num2){
    System.out.println("OR");
    
  }else if (num1!=num2 && word1!=word2){
    System.out.println("NONE");
  }
  
  } 
  
}

