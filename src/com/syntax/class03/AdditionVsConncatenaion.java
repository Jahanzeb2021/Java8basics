package com.syntax.class03;

public class AdditionVsConncatenaion {
	
public static void main(String[] args) {

	int a=100;
	int b=+200;
	
	String x="hello";
    String y="friends";
    
    System.out.println(a+b+x+y);//300hellofriends
    System.out.println(a+x+b+y);//100hello200friends
    System.out.println(x+y+a+b);//hellofriends100200
    System.out.println(x+y+(a+b));//hellofriends300
    
    
	
}
	
}
