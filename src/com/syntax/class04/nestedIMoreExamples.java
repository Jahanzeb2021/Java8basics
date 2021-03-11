package com.syntax.class04;

public class nestedIMoreExamples {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("It is a movie day!!!");

			if (day == 13) {
				System.out.println("I will watch a scary movie!!!");
			} else {
				System.out.println("I watch any available movie");
			}
		} else {
			System.out.println("I will stay at home and study Jaave ");
		}

		System.out.println("--------------2nd Example--------------");

		boolean completed = false;
		int score = 90;

		if (completed) {

			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Great job");
			} else if (score > 70) {
				System.out.println("Good but lets try do better ");
			} else {
				System.out.println("Good for trying, but study more!!!");
			}
		} else {
			System.out.println("Please maek sure to complete all asssigment on time ");
		}
	}

}
