package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		/*ask user to pay for a water
		 * water price is 5
		 * once user enters money then we need to tell if need more money or less
		 * once user gives us exact 5 then --> enjoy your water!
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		input=new Scanner(System.in);
		System.out.println("Please pay for your water !");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if (money>waterPrice) {
		  System.out.println("Too muck money Please pay less !");
		  
		  }else {
			  System.out.println("Water is expensive please insert more money");
		  }
		money=input.nextInt();
		}
    System.out.println("Enjoy your water !");
	
	}

}
