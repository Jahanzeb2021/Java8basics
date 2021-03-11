package com.syntax.class11;

public class Task4 {
public static void main(String[] args) {
//7.Write a java program to print the first 10 number of fibonacci series.
          int a = 0, b = 1, sum = 0;
          System.out.print(a+" "+b+" ");
        
        for (int i = 0; i < 10; i++) {
        	
        	sum=a+b;
        	a=b;//1
        	b=sum;//1
        	
        	System.out.print(sum+" ");
        	
        }
	}

}
