package com.syntax.class08;

import java.util.Scanner;

public class forLoopsTask {

	public static void main(String[] args) {
		
		System.out.println("---Print numbers from 1 to 100 in 1 line with space---");
		
	  for(int a=1;a<=100;a++) {
		 
		  System.out.print(a+" ");
		  
	  }
	 
	  System.out.println("Print numbers from 100 to 1");
		 
	  for(int b=100;b>=1;b--) {
		  
		  System.out.println(b);
	  }
	 
	  System.out.println("------Task--------");
	  int c=20;
	  while(c>=1 ) {
	   if(c%2==0)   {
		   
		   System.out.println(c);
		   
	   }
		
	   c--;
		
	  }

	  System.out.println("-------Another way------");
	  
	 int d=20;
	 while (d>=1) {
	   
		 System.out.println(d+" ");
		 
		 d-=2;
	
	 }
	
	 System.out.println("----Print odd number----");
	 
	 int e=20;
	 
	 while(e<50) {
		 
		 if((e%2)!= 0) {
			 
			 System.out.println(e+" ");
			 
			 
			}
		 e++;
	 }
	 
	System.out.println("-----Anothre way-----");
       
	int f=20;
	
	while(f<=50) {
		
		System.out.println(f);
		
		f+=3;
	   }
	
	System.out.println("------Another way------------");
	
	int result=1;
	
	for (int i=10; i>=1;i-=2) {
		
		result*=i;
		
		System.out.println("Result ="+result);//10,80,480,1920,3840
	}
	
	System.out.println("-----------------");
	//Calculate sum of even and odd numbers from range 1 to 50
	
	int sumo=0;
	int sumE=0;
	
	for(int n =1; n<51 ; n++) {
		
		if (n%2==0) {
			sumE+=n;
		
		}else {
			sumo+=n;
			
			//System.out.println("The sum of even number from 1 to 50 is " +sumE);
			//System.out.println("The sum of even number from 1 to 50 is " +sumo);
		}
		}
	System.out.println("The sum of even number from 1 to 50 is " +sumE);
	System.out.println("The sum of even number from 1 to 50 is " +sumo);
	
	System.out.println("--------------------------");
    //I want to create a multiplication table
	/*
	 * 1x1=1
	 * 1x2=2
	 * 1x3=3
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Plese enter number");
	int num1=scan.nextInt();
	int mult;
	
	for(int i=1; i<=10;i++ ) {
		
	mult=num1*i;
		
		System.out.println(num1+ " x "+i+" = "+mult);
	}
	
	}
}
 


