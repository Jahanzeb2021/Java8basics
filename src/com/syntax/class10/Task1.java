package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

		// Create an array of cars store 6 elements into it.using 2 different loops
		// print all values form the array

		String[] cars= new String[6];
		
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2] = "Lexus";
		cars[3] = "Bmw";
		cars[4] = "Benz";
		cars[5] = "Mustang";

		for (int i = 0; i < cars.length; i++) {

			System.out.print(cars[i] + " ");
		}

		System.out.println();
		System.out.println("----------------2nd Way Loop -------------");

		for (String s : cars) {

			System.out.print(s + " ");
		}

		System.out.println();
		System.out.println("=============================");

		String[] animals = { "dog", "Cat", "Lion", "Tiger", "Horse", "Dankey", };

		for (int t = 0; t < animals.length; t++) {

			System.out.print(animals[t] + " ");
		}

		System.out.println();
		System.out.println("----------2nd way but same out-----------");

		for (String a : animals) {

			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		int [] numbers = new int [6];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		numbers[5]=60;
		
		System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]);
		
		
		   }
		
	}


