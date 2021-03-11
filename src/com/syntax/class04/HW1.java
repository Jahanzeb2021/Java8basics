package com.syntax.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
	
	String city="city";
	double celsius=15;
	
	System.out.println("Which do you live in ?");
	Scanner AMC=new Scanner(System.in);
	city=AMC.next();
	
	System.out.println("Which the Tempreture in celsius where you live ?");
	celsius=AMC.nextDouble();
	
	celsius*=1.8;
	celsius+=32;
	
	System.out.println("The Tempreture in "+city+" city "+celsius+" in farenheit degree");
	

	
	
	
	

	}

}
