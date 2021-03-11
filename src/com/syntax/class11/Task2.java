package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] num = new String [2][4];
		
	    num [0][0]="Mr";
	    num [0][1]="Mrs";
	    num [0][2]="Ms";
	    num [0][3]="Miss";
	    
	    num [1][0]="Smith";
	    num [1][1]="Jordan";
	    num [1][2]="Jackson";
	    num [1][3]="Obama";
	    
	    System.out.println(num[0][1]+num[1][0]+" "+num[0][0]+num[1][3]+" "+
	    num[0][2]+num[1][2]+" "+num[0][3]+num[1][1]);
	    
	   System.out.println("--------------------------");
	   
	   String [][]names= {
			   
			   {"Mrs","Mr","Ms","Mrs"},
			   {"Smith","Jordan","Jackson","Obama"},
	   };
	   
	   String num1=names[0][1]+" "+names[1][3];
	   System.out.println(num1);
	    
	}

}
