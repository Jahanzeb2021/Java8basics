package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		boolean rain = true;
		int temp = 60;
		
		while(rain) {
			
			System.out.println("I will stay at home");
			
			if (temp>75) { 
				
				System.out.println("I will waik under warm rain");
					
				break;
			}
			
			temp+=3;
			
		}
		
		System.out.println();
		System.out.println("-------------I ma code inside for loop-----------");
		
		for( int i = 1; i <= 10; i++) {
			
			System.out.println("Hello");
			
			if (i == 5 ) {
				
				break;	
				}
			
			System.out.println("Hello I am inside the loop");
			
		}

	}

}
