package com.syntax.class11;

public class AllvaluesFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][]usa= {
		
		{"Aleandria","Oakton","Arlington","Virgina","Fairfax"},
		{"Oaklan","SanFransico","Hyawar","Fremont"},
		{"Kabul", "Los angles","Scaramento","Santa Barbara"},
                
		};
		
		//total row
		System.out.println(usa.length);
		//Columns in each row
		System.out.println(usa[0].length);
		System.out.println(usa[1].length);
		System.out.println(usa[2].length);
		
		for(int r = 0; r <usa.length; r++) {
			
			for(int c = 0; c<usa[r].length; c++) {
				
				System.out.print(usa[r][c]+" ");
				
			}
			
			System.out.println();
		}
		
		
	}
}
