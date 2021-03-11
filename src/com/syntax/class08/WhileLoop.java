package com.syntax.class08;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we need to make user to pay for a soda keep asking user to pay you until it
		 * enters 3
		 * 
		 * it user gives more -->3 please give less money if user gives less than -->
		 * please give more money
		 */
		
		
		int money;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for soda!");
		money=scan.nextInt();
		
		while (money!=3) {
			
			if (money < 3 ) {
				System.out.println("Please pay more money");
			}else {
				System.out.println("Please pay less money");
			}
			money=scan.nextInt();
           }
		System.out.println("Thans for your purchase "+money);
	}

}
