package com.syntax.class05;

import java.util.Scanner;

public class Task1BatterWay {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		int heights;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=scan.next();
		
		System.out.println("Please enter heights");
		heights=scan.nextInt();
		
		   String defination;
	       if (heights<60) {
			defination="Short";
			
		}else if(heights> 60 && heights<72){
			defination="Medium";
			
		}else if(heights>72) {       
			 defination="Tall";
			
		}
	       System.out.println("Yor are person who is height is "+heights);
		}
			

	}


