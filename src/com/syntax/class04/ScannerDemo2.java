package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// shah is variable here.
        Scanner shah= new Scanner (System.in);
        System.out.println(" Please enter boolean value for rain");
        
        Boolean rain=shah.nextBoolean();// I waiting for your input please hit enter when your are done 
        
        if(rain ) {
        	System.out.println(" Take your umbrella ");
        }else {
        	System.out.println("It is nice weatther for picnic");
        }
        
        System.out.println("------------ Lets Capture integer value--------");
        System.out.println("Please enter your age");
        int age=shah.nextInt();
        System.out.println("your age is "+age);
	}

}
