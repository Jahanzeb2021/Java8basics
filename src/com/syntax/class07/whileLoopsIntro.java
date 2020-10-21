package com.syntax.class07;

public class whileLoopsIntro {

	public static void main(String[] args) {
		
	int time=15;

    
	if(time > 12) {// condition is true 
		System.out.println("good day");// code executes 3 time 
		
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
		System.out.println("good day");//how many times?= 3 loop
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
	    
 // System.out.println("-----Another way-----");
	    
	   int v =10;
	    while(v<=30) {
	    	 
	    if (v%2==0) {
	    		
	    		//System.out.println(v);
	    		
	    		//System.out.println("I am inside while loop");
		     // if we keep increment here --> we will get infinite loop
	    		
	    		}
	    	
	    	c++;
	      }
	    System.out.println("End of the code");
	    //print number from 100 to 1 odd numbers only
	    
	   int m =99;
	   while(m>0 ) {
		System.out.println(m + " ");
		m-=2;
			   
			    }
		System.out.println(" Another way");
		
		int t =100;
		
		while(t> 0) {
		 
			if ((t % 2) !=0) {
				System.out.println(f + " ");
			}
			
			t--;
			
		}
		
	  
	   }
	    
     }

