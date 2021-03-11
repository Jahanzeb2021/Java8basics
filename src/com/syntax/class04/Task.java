package com.syntax.class04;

public class Task {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.4;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa > 3.5) {
				System.out.println("You are eligible for schlorship");
			} else {
				System.out.println("You shouid studied hard");
			}
		} else {
			System.out.println("Get a degree");
		}
		System.out.println("-------------2nd example------------");

		double mortgageRate = 4.6;
		int price = 30000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("Consider buying house");
		}
		if (price > 200000) {
			System.out.println("I will take a loan ");
		} else {
			System.out.println("Will pay cash ");
		}
	}

}
