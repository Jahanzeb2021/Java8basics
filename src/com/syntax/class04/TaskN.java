package com.syntax.class04;

public class TaskN {

	public static void main(String[] args) {
	
		double morgRate=4;
		int morgPrice=1500;
		
		
		if (morgRate>4.5) {
			
			System.out.println("User will not buy house");
	
		} else {
			
			System.out.println("User will considr buying");
			
			if (morgPrice>200000) {
				System.out.println(" User will take a loan ");
				
			}else {
				System.out.println(" User will pay cash");
			}
		}
			

	}

}
