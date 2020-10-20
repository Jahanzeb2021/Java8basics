package com.syntax.class07;

import java.util.Scanner;

public class LukyNumber {

	public static void main(String[] args) {
        //play a lottery where we need to enter number from 1 to 100
		//luck number is 7
	    //keep asking user to enter a number until entered number is luck number
		
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 100");
			scan.nextInt();
			
		}while(numberFromUser!=luckyNumber);
	}	
	}


