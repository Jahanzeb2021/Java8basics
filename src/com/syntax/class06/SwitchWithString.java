package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * we need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * base on the country we identify the food
		 */
       
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case"usa":
			food="burger";
			break;
		case"afghanistan":
			food="kabob";
			break;
		case "vietnem":
			food="pho";
		    break;
		case "poland":
			food="Pierogi";
		    break;
		case "kazaqkstan":
			food="horse";
			default:
				food="unknown";
				
		}
		System.out.println("Your favorite food = "+food);
	}

}
