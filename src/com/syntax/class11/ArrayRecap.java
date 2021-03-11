package com.syntax.class11;

import java.util.Scanner;

public class ArrayRecap {

	

	public static void main(String[] args) {
		//we need to create an array, that will store elements from a  user
		
		
		Scanner scan;
		String []array;
		
		scan=new Scanner(System.in);
		System.out.println("How many string elements wouid you like to store");
		int size=scan.nextInt();
		array=new String[size];
		
		for (int i =0; i<size; i++) {
		System.out.println("Please enter a String");
		array[i]=scan.next();
		
		
		System.out.println("------------lets see what we stored----------");
		
		for (String str:array) {
			System.out.println(str+"");
		}
		}
		
	}

}
