package com.syntax.class03;

public class Task2 {

	public static void main(String[] args) {

		double A = 15;
		double B = 10;
 
		if (A > B) {
			System.out.println(" A is larger than B ");
		} else {
			System.out.println(" B is larger that A ");
		}

		System.out.println("-----------------------");

		int Temp = 30;

		if (Temp < 32) {
			System.out.println("I am if block");
			System.out.println("Water will freeze with temperature");
			System.out.println("It is very cold");
		} else {
			System.out.println("I am else block ");
			System.out.println("Water will not freeze");

		}

		double money = 5;
		double $coke = 3;

		if (money == $coke) {

			System.out.println("I am buying soda");

		} else {
			System.out.println("I need exact amount");
		}

		boolean snow = true;

		if (snow == true) {
			System.out.println("Yay I will play with the snow");
		} else {
			System.out.println("I am going to ride my biscle");
		}

		System.out.println("----------------------------");

		boolean summer = true;

		if (summer) {
			System.out.println("I am going to Florida");
		} else {
			System.out.println("I will stay at home");
		}

	}

}
