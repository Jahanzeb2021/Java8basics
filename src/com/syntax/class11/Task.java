package com.syntax.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner doo;
		double sum=0;
		
		
		doo=new Scanner(System.in);
		System.out.println("How many double elements wouid you liek to store?");
		int size = doo.nextInt();
		double[] a = new double[size];
		
		for(int i = 0; i<size; i++) {
			
			a[i]=doo.nextDouble();
			sum+=a[i];
			
		}
		
		System.out.println("The sum of "+size+" elements form an array ="+sum);
		
		System.out.println("------------------");
		
		sum=0;
		
		for(double num:a) {
			sum+=num;
		}
		
		System.out.println("The sum of "+size+" elements form an array ="+sum);

	}

}
