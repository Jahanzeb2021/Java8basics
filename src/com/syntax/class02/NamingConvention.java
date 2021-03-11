package com.syntax.class02;

public class NamingConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//keywords - a special word that reserved in java memory; class, static, void, public, final.
		//Identifiers - name that we give to classes, variable and methods
        
		/*
		 * Rule !!!!
		 * Do not use keyword as Identifiers
		 * Identifiers cannot contain space
		 * Identifiers cannot start with numbers
		 * Identifiers cannot have special characters _ Expect or $
		 */
		
		// 1. int final= 10; error: Invalid Identifier
		// 2. byte variable one=12;
		// 3. short 1b=12;
		
		short b1=12;
		
		//4 long *1=2000;
		  //long 1*=2000;
		
		long _l=2000;
		long long_=29990;
		
		double $price=12.99;
		double price$=20.93;
		
		//NamingConvention 
		// 1.we use camel casing
		// 2.classed stars with upper cases and will follow camel casing
		// 3.variable starts with lower case and will follow camel casing
		// 4. packages we use lower case and use name as reverse way of url 
		
		int numOne=12; // try not use uppercase name
		int numTwo=13; // more preferable 
		
		int num=12;
		int Bum=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.89;
		
		
		
	}

}
