package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		
		//int i=12.99; type mismatch
		
		//widening or implicit casting 
		double d=10;
		System.out.println(d);
		
		//narrowing or explicit casting
		int i =(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		float cakePiece=11f;
		cakePiece /=4;
		System.out.println(cakePiece);
		
		int number=12;
		double result=number/5;
		System.out.println(result);
		
		double newNum =10;
		newNum=newNum/3;
		System.out.println(newNum);
		
		System.out.println("---------------------");
		
		//int num1 =10+10.5
		double num1 =10+10.5;
		System.out.println(num1);
		
				
				
				
		
		
		
		
		
		
		
	}

}
