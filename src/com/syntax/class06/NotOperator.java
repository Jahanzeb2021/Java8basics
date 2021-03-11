package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {
		// (!) Operator reverse the condition from True to false/Visa versa.

		boolean rain = true;

		if (!rain) {
			System.out.println("I will go to the park!");
		}

		System.out.println("----------------------");

		boolean boo = !true;
		System.out.println(boo);

		System.out.println("--------------------------");

		boolean boo1 = !false;

		System.out.println(boo1);

		System.out.println("/////////////////////////");

		boolean traffic = true;

		if (!traffic) {
			System.out.println("I wil come on time");
		}

		System.out.println("-------------String------------");

		String day = "Monday";

		if (!day.equals("Friday")) {

			System.out.println("Today is not Friday");
			
		}
		
	  System.out.println("--,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,--");
	  //Not Operator -->always placed before the condition
		boolean homework = false;
		
		if(!homework) {
			System.out.println("I will be happy");
		}
	}

}
