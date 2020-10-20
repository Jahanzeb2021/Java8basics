package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
	   String name;
		Scanner scanner=new Scanner(System.in);
        System.out.println(" Please enter you name here ");
        name = scanner.next();
        System.out.println(" I love you "+name);

	}

}
