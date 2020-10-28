package com.syntax.class08;

public class ForLoop {

	public static void main(String [] args ) {
		
		for (int i=0; i<=5; i ++) {
	    System.out.println("Good Morning");
		
		}
		
		System.out.println("--------------------");
		// I want to print number from 1 to 100
		
		for (int a=1; a<=100; a ++) {
			System.out.println(a);
			
		}
	    
		System.out.println("------ I want to print number to 10 to 0-----");
	    
	    for(int b=10; b>=0; b--) {
	    	
	    	System.out.println(b+" ");
	    	
	    }  
	    
	    System.out.println("-------------");
	    
	    for (int w=0; w<=30; w+=3) {
	    	
	    	System.out.print(w+" ");
	    }
	    
	}
}
