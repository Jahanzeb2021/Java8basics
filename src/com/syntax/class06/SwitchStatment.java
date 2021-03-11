package com.syntax.class06;

public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int day = 4; 
        String weekDay;
		
        if (day == 1) {//work with conditions,it evaluate if true/false
			weekDay="Monday";
		} else if (day == 2) {
			weekDay="Tuesday";
		} else if (day == 3) {
			weekDay="Wednesday";
		} else if (day == 4) {
			weekDay="Thursday";
		} else if (day == 5) {
			weekDay="Friday";
		} else if (day == 6) {
			weekDay="Saturday";
			
		} else if (day == 7) {
			weekDay="Sunday";
		} else {
			weekDay="Invalid";
		}
        if (!weekDay.equals("Invalid")) {
        System.out.println("Today is "+weekDay);
	}
  System.out.println("---------------Using switch-------------");
  
  String weekday1;
  
   switch(day) {// is a value based
   //we CANNOT have duplicate cases
   //values MUST match a variable type
   //we MUST have break in every case
   case 1:
        weekday1="Morning";
        break;
   case 2:
	   weekday1="Tuesday";
	   break;
   case 3: 
	   weekday1="Wednesday";
	   break;
   case 4:
	   weekday1="Thursday";
	   break;
   case 5:
	   weekday1="Friday";
	   break;
   case 6:
	   weekday1="Saturday";
	   break;
   case 7:
	   weekday1="Sunday";
	   break;
	   
	   default:
		weekday1="Invalid";
		   
	   }
   if (!weekDay.equals("Invalid")) {
       System.out.println("Today is "+weekDay);
   }
	}
}