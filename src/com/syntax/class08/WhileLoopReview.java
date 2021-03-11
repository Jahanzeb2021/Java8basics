package com.syntax.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] sha) {

		/*
		 * we need to make user to pay for a soda keep asking user to pay you until it
		 * enters 3
		 * 
		 * it user gives more -->3 please give less money if user gives less than -->
		 * please give more money
		 */

		int money;
		Scanner scan = new Scanner(System.in);
        

		do {
			System.out.println("Please pay 3 Dolar for soda ");
			money = scan.nextInt();
           
			if (money < 3) {
        	   System.out.println("Please pay more money");
        	   
			} else if (money > 3) {
             System.out.println("Pleae pay less money");
             
			}

		} while (money  != 3);

		System.out.println("if money = "+money+ " Thanks for your purchase");

	}

}
