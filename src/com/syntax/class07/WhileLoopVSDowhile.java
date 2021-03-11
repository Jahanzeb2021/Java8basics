package com.syntax.class07;

public class WhileLoopVSDowhile {

	public static void main(String[] args) {
		
		int num =0;
		
		while(num<=5) {
		  System.out.print(num+" ");
		  
		  num++;
		}

		System.out.println();
		System.out.println("----------- do while ------------");
		
		int num1 = 6;
		do {
			
			System.out.print(num1+" ");
			num1++;
			
		}while(num1<=10);
		
		/*
		 * while 1st check then execute
		 * do 1st execute the check
		 * 
		 */
		
		System.out.println();
		System.out.println("-----------End of Asel Code------------");
		
		int s = 20;
		
		while(s <=40){
			
			System.out.print(s+" ");
			
			s++;
		}
		
		System.out.println();
		System.out.println("------------Decrement--------------");
		
		int H = 15;
		do {
			
			System.out.print(H+" ");
			
			H++;
			
		}while(H <= 40);
	
	}

}
