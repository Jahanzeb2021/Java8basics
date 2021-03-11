package com.syntax.class11;

public class NestedforLoopFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums= {
				
				
				{10,10,30},
				{90,80},
				{1,2,3,4,5}
		
		};
		
	   System.out.println(nums.length);
	   System.out.println(nums[1].length);
	   
	   System.out.println("-------------------------");
	   for (int row=0; row<nums.length; row++) {
		   for(int col =0; col<nums[row].length; col++) {
			   
			   System.out.print(nums[row][col]+" ");
			   
		   }
		   
		   System.out.println();
	   }
	   
	   System.out.println("------------------------------");
	   
	   for (int []array :nums) {
		   for(int a:array) {
			   
			   System.out.print(a+" ");
		   }
		   
		   System.out.println();
		   
	   }
	   
	}

}
