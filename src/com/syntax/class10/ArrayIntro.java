package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		num=20;
		System.out.println(num);
		
		int [] array=new int[5];
        
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		
		System.out.println(array[2]);
		
		System.out.println("------------------------------");
		
		double[]numbers= new double[2];
		
		numbers[0]=10.99;
		numbers[1]=90.01;
		
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		
		System.out.println("----------Sring arrays-------------");
		
		//Arrays are fixed in size
		
		String[]name = new String[3];
		
		name[0]="Jahanzeb";
		name[1]="Ilyas";
		name[2]="Amina";
		
		System.out.println(name[2]);
		
		
		System.out.println("-------------Boolean array--------------");
		
		boolean[] b = new boolean[3];
		
		b[0]=true;
		b[1]=true;
		b[2]=false;
		
		System.out.println(b[0]);
		
		
		System.out.println("-------Size---------");
		int size=b.length;
	    System.out.println("Size of an array is "+size);
		
	}

}
