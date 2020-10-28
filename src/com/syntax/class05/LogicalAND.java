package com.syntax.class05;

import java.util.Scanner;

public class LogicalAND {

	public static void main(String[] args) {
	
	//I need to define whether number that is entered from user
     //Small number is a between 0 to 20
     //Medium number is a number between 30 to 100
     //large number is a number between 103 to0 2000
		
		Scanner AND=new Scanner(System.in);
		 System.out.println("Please enter any nymber ");
		 int number=AND.nextInt();
		 
		 
		 
		 if(number>0 && number<=20) {
			System.out.println("The number is small "); 
		 
		 }else if(number>30 && number<100) {
			 System.out.println("The number is medium");
			 
		 }else if(number>103 && number<=2000) {
			System.out.println("The numer is Large"); 
			
		 }else {
			 System.out.println("The number will be invalid");
		 }
		

	}

}
