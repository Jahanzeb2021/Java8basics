package JaveTutorialTelusko;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/*
		 * Arithmetic +' _, /, *, % 
		 * Bitwise
		 * Relational 
		 * Logical
		 */

		int a = 6, b = 4;
		int r1 = a+b;
		int r2 = a-b;
		int r3 = a*b;
		//int r4 = a/b;
		double r4 = (double)a/b; // changing the value of r4 in double to get decimal numbers
		int r5 = a%b; // Modules/Mod use to find the remainder in the division 
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		
	}

}
