package com.syntax.class04;

public class IfElseF {

	public static void main(String[] args) {
		//we need to compare 2 numbers;
		/*Bigger ,smaller or equal.
		 */

		int num1=91;
		int num2=99;
		
		if (num1>num2) {//what if this condition is true
		System.out.println(num1+" is bigger than"+num2);
			
		}else if(num1<num2) {//what if this condition is true 
		System.out.println(num1+" is smaller than "+num2);
		
		}else {
		System.out.println(num1+" is equal to "+num2);
			
		}
		
		System.out.println("---------------------");
		
		/* Based on the day of the week we will print class schedule
		 * 
		 */
		
		int day=9;
		
		if (day==1) {
		System.out.println(" today is monday we have no class");
		
		}else if(day==2) {
		System.out.println(" today is tuesday we manual class ");
			
		}else if(day==3) {
		System.out.println(" today is wednesday and we have a manual class again");
			
		}else if(day==4) {
		System.out.println(" today is thursdday and we hava the review class");
		
		}else if(day==5) {
			
		System.out.println(" today is friday and we dont have a class");
		
		}else if(day==6) {
			
			System.out.println(" to day is sturday and i miss java class");
			
		}else if (day==7) {
			
			System.out.println(" today is sunday and i did a lot of codint");
			
		}else {
			
			System.out.println("this in valid day of a week");
			
		}
			
		
		
		}
	}
	


