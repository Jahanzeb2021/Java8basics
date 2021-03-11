package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		int heights;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=scan.next();
		
		System.out.println("Please enter heights");
		heights=scan.nextInt();
		
	       if (heights<60) {
			System.out.println("Short");
			
		}else if(heights> 60 && heights<72){
			System.out.println("Medium");
			
		}else if(heights>72) {       
			System.out.println("Tall");
			
		}else {
			System.out.println("Invalid age");
		}
		

	}

}
