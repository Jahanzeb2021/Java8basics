package com.syntax.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		
		
		// we have to calculate the commission based on sales.

		Scanner scan;
		double saleAmount, commission;

		scan = new Scanner(System.in);
		System.out.println("Please enter your daily sale amount");
		saleAmount = scan.nextDouble();

		if (saleAmount < 10) {
			commission = 0;
		} else if (saleAmount >= 10 && saleAmount <= 100) {
			commission = saleAmount * 0.1;
		} else if (saleAmount > 100 && saleAmount <= 500) {
			commission = saleAmount * 0.2;
		} else if (saleAmount > 500 && saleAmount <= 1000) {
			commission = saleAmount * 0.3;
		} else {
			commission = saleAmount * 0.5;
		}
		System.out.println("Your daily commission is " + commission);
		// if commission is more than 500 --> you are amazing seller

		if (commission > 500) {
			System.out.println("You are amazing seller");
		}
	}
}
