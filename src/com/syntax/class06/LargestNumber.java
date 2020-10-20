package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner(System.in);
	  
	  Double num1, num2, num3, max;
	  num1 = scanner.nextDouble();
	  num2 = scanner.nextDouble();
	  num3 = scanner.nextDouble();
	  
	  if (num1> num2 && num1 > num3) {
		   max = num1;
	  }else if (num2 > num3) {
		  max = num2;
	  }else {
		  max = num3;
		  
	  }
	  
	  System.out.println(max);
	  double biggest;
	 
	  System.out.println("-----Ccomparing 2 nubers using neste if -----");
	  
	  //2nd way 
	  
	  if (num1>num2) {// number 1 larger than number 2 
	  if (num1>num3) {
		  biggest=num1;
		  
	  }else {
		  biggest=num3;
		  
	  }
	  }else {// number 2 is larger than number 1
		  
	if(num2>num3) {
		biggest=num3;
		
	  
	  }
		 System.out.println("The largest numberis"+biggest); 
	  }
	   }
	}


