package com.syntax.class05;

import java.util.Scanner;

public class Task {

	 public static void main(String[] args) {
		
		String month;
		String season;
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter your birth month");
		  month=scan.nextLine();
		
 if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Februar") || month.equalsIgnoreCase("Mrch")) { 
	 season="Summer";
			  
}  else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June")) {
		   season="Spring";
		  
 } else  {
	 
	 season="Invalid";
	 
 }
 
		  
 System.out.println("you were born in "+season); 

	}

}
