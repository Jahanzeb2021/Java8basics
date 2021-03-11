package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		
		for (int i =1; i<=3; i++) {
			
			System.out.println("Hello");
			
		}
		
		System.out.println();
		
		System.out.println("-------------print number from 1 to 50-------------");
		
		for (int a = 1; a<=50; a++) {
			
			System.out.print(a+" ");
		}
		
		System.out.println();
        System.out.println("--------------print numbers from 10 1-------------");
        
        for ( int b = 10; b>=1; b--) {
        	
        	System.out.print(b+" ");
        }
        
        System.out.println();
        System.out.println("----------------what is my outputs?-------------");
        
        for ( int a = 0; a<=10; a+=2) {
        	
        	System.out.print(a+" ");
        }
        
        System.out.println();
        System.out.println("----------------what is my outputs?-------------");
        
        for (int c = 5; c<=50; c+=10) {
        	System.out.print(c+" ");
        }
	}

}
 