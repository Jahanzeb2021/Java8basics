package com.syntax.class07;

import java.util.Scanner;

public class CalculatorInElesIF {

	public static void main(String[] args) {
	
		Scanner scan;
		double num1, num2,result;
		char operator;
		
	 scan = new Scanner(System.in);
	System.out.println("Enter two numbers please");
	num1 = scan.nextDouble();
	num2 = scan.nextDouble();
	System.out.println("Enter your operator please");
	operator= scan.next().charAt(0);
	
	if(operator == '+') {
		result = num1+num2;
	}else if (operator == '-') {
		result = num1-num2;
	}else if (operator == '/') {
		result = num1 / num2;
	}else if (operator == '*') {
		result = num1 * num2;
	}else {
		result = 0;
	}

	System.out.println(num1+" "+operator+" "+num2+" "+result );
	}

}
