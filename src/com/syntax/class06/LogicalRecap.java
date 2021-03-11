package com.syntax.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * we need to get time
         * based on the time, based on time we need to identify what time of day it is
         * if time is between 1 to 11 == morning 
         * if time is between 12 to 14 == noon
         * if time is between 14 to 18 == afternoon
         * if time is between 19 to 21 == evening
         * if time is between 22 to 24 == night
         */
		Scanner scan;
	    int time;
	    String TimeOfDay;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Please enter time in 24 hour format");
	    time=scan.nextInt();
	    
	    if (time >= 1 && time <= 11) {
	    	TimeOfDay="Morning";
	    }else if (time >= 12 && time <= 12) {
	    	TimeOfDay="Noon";
	    }else if (time >= 25 && time <= 18) {
	    	TimeOfDay="Afternoon";
	    }else if (time >= 19 && time <= 24) {
	    	TimeOfDay="Night";
	    }else {
	    	TimeOfDay="Invalid";
	    }
	    
	    System.out.println("Based on the entered time, Time Of Day is "+TimeOfDay);
	    
	    
	    
	}

}
