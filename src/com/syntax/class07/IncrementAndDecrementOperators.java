package com.syntax.class07;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int z=10;
		z=z+2;
		z+=5;
		
		System.out.println(z);
		
		
		
		System.out.println("-------------------");
		
		z++;// adds 1 to the variable;
		System.out.println(z);
		System.out.println("----------------------------");
		int x=20;
		x-=1;
		x--;//Decrement operator ==> subtract 1 from the variable
		System.out.println(x);
		
		//100++;CE
		
		// Increment and decrement operator can be only used with variable/not value
        
		
		System.out.println("---------------Increment!---------------");
		
		int h = 6;
		h+=3;
		h=h+4;
		h++;
		System.out.println(h);
		
		
		System.out.println("----------------Decrement!----------------");
		
		long n = 20;
		n--;
		n-=4;
		n=n-5;
		
		
		
		System.out.println(n);
	}

}
