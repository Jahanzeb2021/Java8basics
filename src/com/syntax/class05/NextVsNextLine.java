package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num= scan.nextInt();
		
		System.out.println(num);
		
		System.out.println("Enter text");
		String text =scan.nextLine();
		System.out.println(text);
		

	}

}
