package com.syntax.class04;

public class NestedIFAnotherExample {

	public static void main(String[] args) {
		
		boolean morning = true;
		boolean classToday= false;
		
		if (morning) {
			System.out.println("I am going to work");
		}else {
			System.out.println("Let me check if I have a class today");
			
		if (classToday) { 
			System.out.println("I will attend class at syntax");
		}else {
			System.out.println("I can relax");
		}
		}

	}

}
