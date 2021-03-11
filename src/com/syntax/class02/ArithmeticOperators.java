package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=5;
		
		// +, *,/,-,%
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println("------------1-----------");
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is = 15 
		System.out.println("sum of number "+ num1 + " and "+ num2 + " is = " +sum);
		
		System.out.println("------------2----------");
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number1/number2;
		
		System.out.println("Result of division of 2 double values "+ divOfDouble);
		
		System.out.println("------------3-----------------");
		
		float number3=10.99f;
	    float number4=90.99f;
	    
	    float divOffloat=number3/number4;
	    
	    System.out.println("Result of division of 2 float values " +divOffloat);
		
	    System.out.println("------------4-----------------");
		//precedence()--> * & / --> + & -
	    int result=(10+2)*5;
	    System.out.println(result);
	    
	    //modulus operator --> shows reminder of the division 
	    int mod=10%3;
	    System.out.println("Remainder is = "+mod);//1
	    
	    int mod1=10%2;
	    System.out.println("Remainder is = "+mod1);//
	}

}
