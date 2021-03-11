package com.syntax.class03;

public class IfElseIF {

	public static void main(String[] args) {

		// compare 2 numbers -->3 possible conditions
		double num1 = 15.20;
		double num2 = 15.20;   

		if (num1 > num2) { 
			System.out.println("double value " + num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println("double value " + num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		// 2. dased on the day number define aday
		int day = 0;

		if (day == 1) {
			System.out.println("Today is Mondeay");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Todya is Wednesday");
		} else if (day == 4) {
			System.out.println("Todya is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Starday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Day is Invalid");
		}
		System.out.println("---------End of Code---------");
	}

}
