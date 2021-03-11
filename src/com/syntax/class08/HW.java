package com.syntax.class08;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// * calculate sum of odd and even numbers from 1 to 50 */
		 System.out.println("---------------One Way---------------------");
				int oddSum = 0;
				for (int a = 1; a <= 50; a += 2) {
					oddSum = oddSum + a;
				}
				System.out.print(" The sum of odd number from 1 to 50 is " + oddSum);
				
				System.out.println();
		        System.out.println("----------Another Way------------------");
				int evenSum = 0;
				for (int b = 1; b <= 50; b += 2) {
					evenSum += b;
				}
				System.out.println();
				System.out.print(" From 1 to 50 Evennumber sum is " + evenSum);
			}
	}


