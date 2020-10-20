package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
	
 /*if day is 1 or 5 --> I am off from syntax
  * if day 2 or 3 ---> GIT classes
  *if day is 4---> Review class 
  * if day 6 or 7 ---> Java class
  * everything else will be invalid
  */
		
		Scanner shah=new Scanner(System.in);
		System.out.println("Please enterd the todays day using numbr only");
		int today=shah.nextInt();
		
		if(today==1 || today==5) {
			System.out.println("I am off from syntax ");
			
		}else if(today==2 || today==3) {
			System.out.println("Today is GIT class ");
			
		}else if(today==4) {
			System.out.println("I have a Review class");
			
		}else if(today==6 || today==7) {
		
			System.out.println("It is JAVA class");
		}else {
		System.out.println("Please enter a valid day from 1 to 7");
		
		}
		
	}

}
