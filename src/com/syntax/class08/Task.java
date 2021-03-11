package com.syntax.class08;

import java.util.Scanner;


public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
                continue;
			}

			System.out.print(i + " ");
		}
     
		System.out.println();
        System.out.println("-------------------------------");
      
       String CreditCard;
       Scanner scan = new Scanner(System.in);
       
       
       
       
       do {
    	   System.out.println("Please aplly for the credit cart");
    	   CreditCard=scan.next();
    	   
    	  }while(!CreditCard.equalsIgnoreCase("Yes"));{
    		  
    		  System.out.println("No more Question"); 
    	  }
       
       
	}

}
