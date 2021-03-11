package com.syntax.class05;

import java.util.Scanner;

public class LogicalOpratorExample {

	public static void main(String[] args) {
		/*
		 * ask user enter age
		 * based on age we will define
		 * if age is from 1 to 3 --> you are baby
		 * if age is from, 3 t0 5 --> you are bigger baby 
		 * if age is from 5 to 12 --> you are kid 
		 * 
		 */
		
		Scanner input;
		String name;
		int age;
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if(age>=1 &&  age<3) {
			System.out.println(name+" You are baby");
		}else if(age>= 3 && age<5) {
			System.out.println(name+" your are bigger");
		}else if(age>=5 && age<=12){
			System.out.println(name+" You are kid");
		}else if(age>= 13 && age<=19) {
			System.out.println(name+" You are teenagers");
		}else if(age==20) {
			System.out.println(name+" you are adult");
		}else {
			System.out.println("Invalid age");
		}

	}

}
