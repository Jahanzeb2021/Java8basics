package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for ( int i = 1; i <= 10; i ++) {
			
			System.out.println("Hello");
			
			if(i == 3 ) {
				
				continue;
			}
			
			System.out.println(" I ma inside the loop");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		/*
		 * you need to print all numbers from 1 to 10 expect 5 and 6
		 * 
		 */
        
		for (int b = 1; b<= 10; b++) {
			
			if (b== 5 || b == 6) {
				
				continue;
			}
			
			System.out.print(b+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		/*
		 * you need to print number 1 to 40 expect those that are divisible by 4
		 *  
		 */
			
		for (int a = 1; a <= 40; a++) {
			
			if(a%4==0) {
				continue;
			}
			System.out.print(a+" ");
		}
		
	}

}
