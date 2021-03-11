package com.syntax.class10;

public class TaskCharArrays {

	public static void main(String[] args) {
		
		
		char[]grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		System.out.println("--------diffrent way Array-----------");
		
		char [] grades= {'A','B','C','D','E','F'};
		
		System.out.println(grades[5]);
		System.out.println("Number of elementsin 2 array "+grades.length);
		
	}

}
