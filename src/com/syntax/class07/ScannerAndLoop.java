package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// I want to capture your name 5 times and say hello to you 
		
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int  q =5;
		while(q<=10){
			
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("hello "+name);
			
			q++;
		}
			
	}	

	}


