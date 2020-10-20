package com.syntax.class04;

public class NestedfConditions {

	public static void main(String[] args) {
		
		String name="Jahanzeb";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8;
		boolean transAlloed=true;
		
		if(pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank "+name);
	    if (transAlloed) {
		    System.out.println(" Initialing transfer");
		 if(transferAmount> accountBalance) {
	        System.out.println(" Insufficient balance");
		   }else {
			System.out.println("transfer complete");
		  } else {

		  }
	    }
		
		}
		

	

