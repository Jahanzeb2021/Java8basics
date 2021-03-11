package com.syntax.class04;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
	 System.out.println("How much loan do you need ? ");
	  
	 Scanner loan=new Scanner (System.in);
	 int loan1=loan.nextInt();
	 
	 if(loan1<=200000) {
		 System.out.println("Congrats! you are approved for loan !!!");
	 }else {
		 System.out.println("Sorry, you are not qualify for loan");
	 }
	
	 System.out.println("                  ");
	System.out.println("---------------End HomeWork # 1");	
	
	System.out.println("                           ");
	
	Scanner DMV=new Scanner(System.in);
    System.out.println("How are old you Please ???");
    int age = 18;
    
     age=DMV.nextInt();
    
    if(age>=18) {
       System.out.println("You eligible for deriving license becuse age is "+age+" years old");
    }else {
    	System.out.println("You need to get learner permit because your age is "+age+" years old");
    }
    
    System.out.println("                              ");
    System.out.println("----------------------End of 2nd HomeWork-----------------");
    System.out.println("                              ");
    
    
    
     System.out.println("Which City do you live in ?");
     Scanner num=new Scanner(System.in);
     String  city=num.next();
     
     System.out.println("What is tempreture in city "+city+" in farenheit ?");
     double farenheit=num.nextDouble();
     
     farenheit-=32;
     farenheit/=1.8;
     
     System.out.println("The tempreture in the "+city+" City "+farenheit+" in celsius ");
     
     
     
     
     
    
    
    
    
    
    

	}

}
