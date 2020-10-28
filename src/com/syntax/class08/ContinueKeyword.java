package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
	 
		// i want to print number from 1 to 5 except numer 3
		
		for (int i = 1; i<=5; i++) {
			
			if (i==3) {
				
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("--------------");
	// I want to print number from 1 to 10 except number 3 & 7
		
		for (int e = 1; e <10; e++) {
			
			if(e==3 || e==7) {
			  continue;
			}
			System.out.println(e);
		}
		
		System.out.println("---------------");
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 3 == 0) {
				
			}
			
			System.out.print(i+" ");
		}
				
;
    // Task 2
		System.out.println();
	   /*Create a program that will keep asking user to apply for a credit credit card
	    * As soon you get "yes" from a user program shouId stop asking 
	    */
	
		Scanner scan= new Scanner(System.in);
		String responce;
		
		do {
			
			System.out.println("Do you want to apply for the credit card??");
			responce=scan.nextLine();
			
			}while(!responce.equalsIgnoreCase("Yes"));
		System.out.println("You are selected");
		
		//Task 3
		System.out.println();
		System.out.println("--------Task 3----------");
		/*
		 *write a program that read a range of integers (Start and end points) 
		 *Provided by a user and then from that range prints the sum af even and odd integers
		 */
		
		System.out.println("Plese enter start point number");
		int startpoint =scan.nextInt();
		
		System.out.println("Please enter end point number ");
		int endpoint =scan.nextInt();
		
		     int SumE = 0, Sumo= 0;
		     
		for (int i = startpoint; i <= endpoint; i++) {
			
			if(i % 2==0) {
				SumE += i;
				
			}
			if ( i % 2 !=0) {
				Sumo += i;
			}
			System.out.println("SumE is "+ SumE);
			System.out.println("Sumo is "+ Sumo);
		}
	}
	
	

}
