package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");
		boolean answer=scan.nextBoolean();
		
		if(answer) {
			System.out.println("What is the balance on your card?");
		     int balance=scan.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay of your card balance?");
			}else {
				System.out.println("You can spent more $$");
			}
			
		}else {
			System.out.println("Wouid you like to get a credit card");
			
		}

	}

}
