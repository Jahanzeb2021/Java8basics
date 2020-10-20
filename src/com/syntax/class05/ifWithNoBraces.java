package com.syntax.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
	 
	System.out.println("Start from here!!!");
	
	Boolean isSaturday=false;
	
	if (isSaturday) 
    System.out.println("Today is a java class");//if no braces only 1 line be treated as code for if block
	System.out.println("And tomm i will play socce");//this code does not belong to this if statement(because no braces)
	
	System.out.println("I am a code outside of if statment");

	}

}
