package com.syntax.class06;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		
		int num1, num2,num3,largest;
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter 3 Numbes");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (num1 == num2 && num2 == num3) {
		    System.out.println("Numbers are equals! ");
		}else {
			
		}
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
				}
		}else {
			
			if (num2>num3) {
				largest=num2;
			}else {
				largest=num3;
				
			}
			System.out.println("The largest number among "+num1+", "+num2+", "+num3+" is "+largest);
		}
		 
        System.out.println("----------------Done-----------------");
	}

}
