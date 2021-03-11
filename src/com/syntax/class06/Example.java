package com.syntax.class06;

import java.util.Scanner;

public class Example {

	private static double fianlprice;

	public static void main(String[] args) {
		/*
		 * we need to calculate final price after the discount 
		 * we check if there is sale 
		 * if no sale --> I am not going for shopping 
		 * if there is sale
		 * we will ask the item
		 * we will ask price 
		 *    
		 *    if price is less than 10--> apply 5% discount
		 *    if price is between 10 to 100 --> apply 10% discount
		 *    if price is between 1oo to 500 --> apply 20 % discount
		 *    if price is more than 500 --> apply 30 % discount
		 */
        
		System.out.println("----------------Strart Point Code---------------");
		
		boolean sale;
		int price;
		int finalprice;
		String item;
		double discount = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Do you hava a sale ?");
		sale = scan.nextBoolean();
		
		
		if(!sale) {
			System.out.println("I am not going for the shopping");
		}else{
		  
			System.out.println("Do you have an Item ?");
			item=scan.next();
		    
			System.out.println("What is the pirce ?");
			price=scan.nextInt();
			
			if(price > 0 && price < 10) {
				discount = price * 0.05;
			}else if (price > 10 && price < 100) {
				discount = price * 0.1;
			}else if ( price > 100 && price < 500) {
				discount = price * 0.2;
			}else if (price > 500 ) {
				discount = price * 0.3;
				
			}
			
		  fianlprice=price-discount;
		System.out.println("You are buying "+item+" with original price = "+price+
				 " after discount "+discount+" your final price is =$"+fianlprice);
			
			
				}
		    }
		}
	
