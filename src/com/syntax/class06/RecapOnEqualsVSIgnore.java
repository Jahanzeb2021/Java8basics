package com.syntax.class06;

public class RecapOnEqualsVSIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String str1 ="Hello";
		String str2="hello";
		
		boolean YesOrNo= str1.equals(str2);
		System.out.println(YesOrNo);
		
		boolean YesorNo= str1.equalsIgnoreCase(str2);
		System.out.println(YesorNo);
		

	}

}
