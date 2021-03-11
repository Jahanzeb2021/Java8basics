package com.syntax.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	 
		int i = 10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter any text");
		                             //capture entire text with space
		String text=scan.nextLine();//scan.nextline();-- capture input from console,
		                            //once your enter text you must hit Enter 
		
		System.out.println("Text that I entered is "+text);
		
		System.out.println("Please enter your name");
		
		String name=scan.next();//captures 1 word till space
		
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println("My name is "+name+" and am "+age+" years old");

	}

}
