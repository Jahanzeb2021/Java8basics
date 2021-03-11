package com.syntax.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		/*
		 * store gender using M or F based on the we will specify if M-->Male or
		 * F--> Female otherwise -->not sure
		 * 
		 */
     char gender='F';
     String des;
     
     switch(gender){
     
     case 'M' :
           des="Male";
     break;
           case 'F':
    	   des="Female";
     break;
    	 
     default:
    	 des="N/A";
    	 break;
     }
     
     System.out.println(des);
     
     /*
      * Limitation
      * switch CANNOT use relational or logical operators (It simply check 
      * switch CANNOT be used with double ,float, boolean, long,
      * 
      */
	}
	
}
