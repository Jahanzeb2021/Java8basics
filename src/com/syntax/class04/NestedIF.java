package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean morning = true;
		boolean classToday = false;

		if (morning) { 
			System.out.println("Let me check if I have calss today");

			if (classToday) {

				System.out.println("Good morning my classmated");
			} else {
				System.out.println("Good morning my family");
			}
		}
		System.out.println("---------End of the code------------");

		System.out.println("---------2nd Example--------------");

		boolean anyAllergy = true;

		boolean pollenAllergy = false;

		if (anyAllergy) {
			System.out.println("Lets check with allergies you have ");

			if (pollenAllergy) {
				System.out.println("Do not get close to to trees");
			}
		} else {
			System.out.println("You are lucky not having any allergies");
		}
		
		
		
		
	}

}
