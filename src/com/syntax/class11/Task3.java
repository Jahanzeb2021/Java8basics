package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] cars = {

				{ "Ford", "Cheverlet", "Jeep" }, { "Benx", "BMW", "Audi", "Subaru" }, { "Matrix", "Lamo", "Ferr" },
				{ "doo", "Boo", "ooo" } };

		System.out.println(cars.length);
		System.out.println(cars[1].length);

		for (int row = 0; row < cars.length; row++) {

			for (int col = 0; col < cars[row].length; col++) {

				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------");
		for (String[] car : cars) {

			for (String c : car) {

				System.out.print(c + " ");
			}

			System.out.println();
		}
	}

}
