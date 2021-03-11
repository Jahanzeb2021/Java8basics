package com.syntax.class10;

public class AllElementsUsingAdvanceForLoop {

	public static void main(String[] args) {
		
		int[]numbers= {10,14,78,5,90,75};
		
		// for each, enhanced for loop / advanced for loop
		
		for(int num:numbers) {
			
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("-------------Char Elements--------------");
		
		char [] grades= {'A','B','C','D','E','F'};
		
		for(char c:grades) {
			
			System.out.print(c+" ");
			
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		boolean[] boo = {true, false, true, false, true};
		
		for(boolean b:boo) {
			
			System.out.print(b+" ");
		}
	
	}

}
