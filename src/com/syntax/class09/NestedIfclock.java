package com.syntax.class09;

public class NestedIfclock {

	public static void main(String [] Shah) {

	System.out.println("-------------------Clock-----------------");
	
	for (int h = 0; h < 24; h++) {
		
		for (int m = 0; m < 60; m++) {
			
			if (h<10 && m<10) {
				System.out.println("0"+h+":0"+m);
			}else if(h< 10 && m>=10) {
			     System.out.println("0"+h+":"+m);
			} else if(h>=10 && m<10) {
				System.out.println(h+":0"+m);
			}else {
				System.out.println(h+":"+m);	
			}
			
		}
	}
	
	System.out.println("-----------Clock With NestedIf------------------");
	
    for (int h = 0; h < 24; h++) {
		
		for (int m = 0; m < 60; m++) {
			
			if(h<10) {
				
				if(m<10) {
					System.out.println("0"+h+":0"+m);
				}else {
					System.out.println("0"+h+":"+m);
				}
			}else {
				if(m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
				
			  }
			
		   }
		
		}
    System.out.println("-----------------Mutiplication Table--------------------");
    
    int result;
    
    for(int a = 1; a <= 9; a++) {
    	
    	for (int b = 1; b <=9; b++) {
    		
    		result=a*b;
    		
    		System.out.println(a+ " x " + b +" =" +result);
    	}
    	
    	
    }
    
    
	}

}


