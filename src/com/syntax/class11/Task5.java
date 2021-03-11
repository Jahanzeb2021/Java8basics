package com.syntax.class11;

public class Task5 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[]array={45, 20, 30, 5, 3, 60, 70, 80 };
	    int min=array[0];
	    int max=array[0];
	    
	     for (int i = 0; i <array.length; i++) {
	    	
	    	 if(array[i] > max) {
	    		 max=array[i];
	    	 }
	    	
	    	 if(array[i] < min) {
	    		 min=array[i];
	    	 }
	    	
	    }
	      System.out.println("Manimum number = "+min); 
	      System.out.println("Maximum number = "+max);
	}

}
