package com.syntax.class07;

public class whileLoopsIntro {

	public static void main(String[] args) {
		
	int time=15;
	
	//be your own boss
    
	if(time > 12) {// condition is true 
		System.out.println("good day");// code executes 1 time 
		
	}
	
	System.out.println("-------While Loop----------");
	
	while (time > 12) {
		System.out.println("good day");//how many times?=3
		time--;
		
		}
	
	while (time > 12) {
		System.out.println("good day");//how many times?=Infinite loop
		time++;
	
	}
	
	while (time > 12) {
		System.out.println("good day");//how many times?=Infinite loop
		time--;
	}
	
	// I want to print number from 1 to 50 
	
	int num=0;
	 while (num<=50) {
		 System.out.println(num);
		 num++;
		 
	 }
		 
	 // i want to print number 10 to 60
	 System.out.println("printing number 10 to 60 ------------");
	 int b=10;
	 while (b<=60) {
		 System.out.print(b+" ");
		 b++;
	 } 
	// i want to print number 100 to 50
		 System.out.println("printing number 100 to 50 ------------"); 
	 
		int c=100;
	    while (c>=50) {
	    	System.out.println(c);
	    	c--;
	    	
	    }
	    
	    //i want to print number 1o to 30
		 System.out.println("printing number 10 to 30 only even -------"); 
	 
		int d=10;
	    while (d<=30) {
	    	if(d%2==0) {
	    		
	    		System.out.println(d);
	    		
	    		
	    	}
	    d++;
	     }
	    System.out.println("Another way");
	    
	    int f =10;
	    while(f<=30) {
	    	System.out.print(f);
	    	f+=2;
	    	
	    }
	    
}
}
