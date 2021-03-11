package com.syntax.class04;

public class NestedIFLastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * to donate: you must be 18 and older,otherwise you cannot you weight must be
		 * more than 110 lbs otherwise you cannot donate
		 */

		int age = 19;
		int weights = 110;

		if (age >= 18) {
			System.out.println("To donate");

		} else {
			System.out.println("You cant donat");

			if (weights >= 111) {
				System.out.println("You can");
			} else {
				System.out.println("You cant ");
			}
		}
	}

}
