package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 3; i++) {
			
			System.out.println(i);
			
			for ( int j = 10; j<=12; j++) {
				System.out.println("Good Evening");
			}
		}
		
		System.out.println("--------------2nd--------------");
		
		for (int a = 1; a < 3; a++) {
			
			
			
			for (int b=1; b <=4; b++) {
				
			System.out.println(a+","+b);
				
			}
			
			System.out.println();
		}
		
		System.out.println("----------prnt number from 10 99 using nested loop---------");
		
		for (int c = 0; c <10; c++) {
			
			for ( int d=0; d <=9; d++) {
				
				System.out.println(c+ " "+d);
			}
			
		
		}
		
		System.out.println("-------------Car Odometer----------------");
		
		for (int a= 0 ; a < 10; a++) {
			
			for (int b = 0; b < 10; b++) {
				
				for (int c = 0; c< 10; c++) {
					for (int d = 0; d < 10; d ++) {
						
					System.out.println(a + " " + b + " " + c + " " + d);
					}
				}
		
			}
	
		}
			
		
		}
	}


