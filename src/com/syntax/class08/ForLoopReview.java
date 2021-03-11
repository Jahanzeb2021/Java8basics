package com.syntax.class08;

public class ForLoopReview {

	public static void main(String[] args) {
		// I want to create a multiplication table
		//1*1=1
		//1*2=2
		//1*3=3
		//1*4=4
		
		int num = 5;
		int mult;
		
		for (int d = 1; d <= 10; d++) {
			
			mult=num*d;
			
			System.out.println(num+" * "+d+" = "+mult);
		}
		
		System.out.println();
		System.out.println("---------------Next----------------");
		
	

	}

}
