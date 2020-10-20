package com.syntax.class04;

//shortcut to import Cmnd+shift+o
//For Macbook Com+shift+o
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		int num=80;
		String str=" i am a String ";
		//Scan is variable that assigned here
		Scanner scan=new Scanner(System.in);//enable input to the console
		//i adding some massage to the user 
		
		System.out.println("please enter any text");
		String value=scan.nextLine();//waits for you in put and once provided input -->hit enter 
   
		System.out.println(" I captured value ="+value);
		
		System.out.println("Please enter your name");
		 String name=scan.nextLine();
		 System.out.println("Nice to meet to meet you "+name);
		 
		 
	
	}

}
