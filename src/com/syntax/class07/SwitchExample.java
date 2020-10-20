package com.syntax.class07;

public class SwitchExample {
 public static void main(String [] args ) {
	 
	 String month="January";
	 // if month is december -->februar -->winter
	 // if month is marhch or april or may --> spring 
	 switch(month) {
		 
	 case "March":
	 case "January":
	 case "February":
		 System.out.println("winter");
     break;
        
	 case "June": 
	 case "April":
	 case "may":
		 System.out.println("spring");
	 break;
	 
	 case "July":
	 case "Augest":
	 case "September":
		System.out.println("fall");
     default:
    	 System.out.println("Invalid month");
		
		
	 }
 
 }
 
}
