package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * variable day
		 * if day is tuesday or wednesday --> manual class
		 * if day monday or friday --> no class
		 * if is starday or sunday --> Java Class 
		 * if day is thursday --> review calss 
		 */
		
	  String day= "Monday";
	  
	  if (day.equals("Monday") || day.equals("Friday")) {
		  System.out.println("Today i have no class");
		  
	  }else if(day.equals("Tuesday") || day.equals("Wednesday")) {
		  System.out.println("Todya i have manual class");
		  
	  }else if(day.equals("Thursday")) {
		  System.out.println("Today i have review class");
		  
	  }else if(day.equals("Starday") || day.equals("Sunday")) {
		  System.out.println("Today i have JAVA class");
		  
	  }else {
		  System.out.println(day+" is Invalid");
	  }

	}

}
