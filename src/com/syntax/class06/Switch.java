package com.syntax.class06;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		char operation;
		int results =0;
		
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please ent two numbers");
	 num1=scan.nextInt();
	 num2=scan.nextInt();
	 System.out.println("Please enter the operation + - / *");
	 operation=scan.next().charAt(0);
	 
	 if(operation=='+') {
		 results=num1+num2;
		 
	}else if (operation=='_') {
		results=num1-num2;
	}else if (operation=='*') {
		results=num1*num2;
	}else if (operation=='/') {
		results=num1/num2;
		
	}else {
		System.out.println("Invalid operation");
	}

	 System.out.println(results);
	 
	 }

}
