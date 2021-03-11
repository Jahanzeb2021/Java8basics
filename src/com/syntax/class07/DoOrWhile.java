package com.syntax.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
	
		int num;
		int lotteryNumber=17;
		Scanner input=new Scanner(System.in);
		
		
		do {
	   System.out.println("Please enter any numner from 1 to 100 to win the lottery");
	   num=input.nextInt();
		
		}while(num!=lotteryNumber);
		
		
		System.out.println("Congrats! your entered "+num+" which is a lucky number");
        
		
	}
	
}
