package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String name1="olga";  
	     //I wouid like to say: My name is olga
	   System.out.println("My name is "+name1);
	   
	   String lastname="valy";
	   //I wouid like to print: 0lga valy
	   System.out.println(name1 +" "+ lastname);
	   
	   String city="Kabul";
	   //olga lives in kabul
	   System.out.println(name1+" lives in "+city);
	   
	   char grade='A';
	   //olga is A student
	   System.out.println(name1+" is "+grade+" student ");
	   
	   int age=21;
	   //olga is 21 years old
	   System.out.println(name1+" is "+age+" years old");
	   //to attach/concatenate any value (char.int,string,double) to string we use +
	   int date=27;
	   String month="September";
	   System.out.println(date+" "+month);
	   
	   
	  
	   
	   
	   
	   
	   
	   

	}

}
