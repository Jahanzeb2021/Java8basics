package com.syntax.class09;

public class Pathrens {

	public static void main(String [] Shah) {
		
		for (int i = 0; i< 5; i++) {
			
			System.out.print("* ");
		}
		
		System.out.println();
		
		System.out.println("-------------------------");
		
		for (int a = 1; a <= 4; a++) {
			
			for (int b = 1; b <= 6; b++) {
				
				System.out.print("* ");
			}
	
			System.out.println();
		}
		
		
		System.out.println("--------------Big Square---------------");
		
           for (int a = 1; a <= 6; a++) {
			
			for (int b = 1; b <= 8; b++) {
				
				System.out.print("* ");
			}
	
			System.out.println();
		}
           
           System.out.println("-----------------Numbers-------------");
          
           for (int a = 1; a <= 4; a++) {
   			
   			for (int b = 1; b <= 5; b++) {
   				
   				System.out.print(b+" ");
   			}
   	
   			System.out.println();
   		}
           
           System.out.println("----------------Reverse Number-------------");
           
           for (int a = 5; a >= 1; a--) {
   			
   			for (int b = 6; b >=1; b--) {
   				
   				System.out.print(b+" ");
   			}
   	
   			System.out.println();
   		}
           
           System.out.println("===========================");
           
           for (int a = 1; a <= 5; a++) {
      			
      			for (int b = 1; b <= 5; b++) {
      				
      				System.out.print(a+" ");
      			}
      	
      			System.out.println();
      		} 
           
           System.out.println("--------------Triangle--------------");
           
           for (int r = 1; r <= 5; r++) {
        	   
        	   for (int c =1; c<=r; c++) {
        		   
        		   System.out.print("* ");
        	   }
        		 System.out.println();  
        		   
           }
              
		
		}

}
