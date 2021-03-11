package com.syntax.class07;

public class LoopIntro {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		// with the help loop we can reaped same block of code as many times we want
        
		System.out.println("---------------------------");
		
	int time = 7;
	if (time <12) {
		System.out.println("Hello");
	}
	
	System.out.println("--------------------While Loop-------------------");
	
	while (time <12) {
		
		System.out.println("Hello");//code runs forever
		time ++;
		
	}
	
	System.out.println("------------- print numbers from 1 to 10----------");
	
	int num = 1;
	
	while ( num <=11) {
		System.out.println(num);
		num++;
	}
	
	System.out.println("------------print number from 20 to 40--------------");
	
  num=20;
  
  while (num<=40) {
	  
	  System.out.print(num+" ");
	  num++;
  }
   
  System.out.println();
  System.out.println("-----------------print numbers 10 to 1 -----------");
   
		int a=10;
		
		while(a>=1) {
			
			System.out.print(a+" ");
			
			a--;
		}
	}
	}


