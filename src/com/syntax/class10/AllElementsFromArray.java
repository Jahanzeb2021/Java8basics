package com.syntax.class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		
		int[]numbers= {10,14,78,5,90,75};

		for(int i= 0; i<numbers.length; i++) {
			
			System.out.print(numbers[i]+" ");
			
			
				
			}
		
		System.out.println();
		System.out.println("-------------Print in reverse---------");
		
		for(int a=numbers.length-1; a>=0; a--) {
			
			System.out.print(numbers[a]+" ");
		}
	}

}
