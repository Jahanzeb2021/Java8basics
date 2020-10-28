package com.syntax.class10;

import java.util.Scanner;

public class whileLoopsWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double num1;
		double num2;
		char operation;
		double results;
		boolean continueloop=true;
		String end;
		
		while(continueloop) {
		System.out.println("Pleae enter two numers");
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextDouble();
		num2=scanner.nextDouble();
		System.out.println("Please enter the operation + - / * ");
		operation=scanner.next().charAt(0);
	switch(operation) {
	case '+':
	results = num1 + num2;
	break;
	case '-':
		results = num1 - num2;
		break;
	case '/':
		results = num1 * num2;
		break;	
	case '*':
		results = num1 / num2;
		break;
		
	default:
		results=0;
	
	}
	
	System.out.println("results" + results);
	System.out.println();
	
	if("No".equals(scanner.next())) {
	 continueloop=false;
		
	}
	}
	}

}
