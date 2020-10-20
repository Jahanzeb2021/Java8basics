package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//Class5
	    // Scanner- it is class that is use to take input from a user 
		//Scanner scan;<--Variable;
		//scan=new Scanner(System.in);
		// I want to capture sentence
		//String scan=scanner.nextLine();
		// I want to capture whole number
		// Int number=scanner.nextInt();
		// I want to capture 1 word
		// String word=scanner.next(0;
		// I want to capture 1 character
		//char singleCharacter=scanner.next().charAt(0).
		
		Scanner scan=new Scanner(System.in);
		
		//Capture to capture sentence
	    
		String sentence=scan.nextLine();
		System.out.println("You enterred sentence: "+sentence);
		
		// I want to capture number
		int number=scan.nextInt();
		System.out.println("You entered number: "+number);
		
		//I want to capture 1 word
		String word=scan.next();
		System.out.println("You entered word: "+word);
		
		//I want to capture 1 character
		char singleCharater=scan.next().charAt(0);
		System.out.println("You entered 1 character: "+singleCharater);
		

	}

}
