package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {
    /*
     * var for allergy yes or no
     * if allergy yes 
     * we will check if pet allergy 
     * if peanut allergy
     * if no allergy you lucky!!!
     * 
     */

		boolean allergy=true; 
		boolean petAllergy=false;
		
	
		if (allergy) {
		System.out.println("lets do further check");
		
		if (petAllergy) {
			System.out.println("please dont keep pet at home");
			
		}else {
			System.out.println(" That is good you do not have petallergy");
		}
			
		}else {
			System.out.println("You are lucky");
		}
		
		System.out.println("------------Example2-------------");
		
	    /*
	     * if today is friday we will watch movie but wouid like to check the date
	     *    if date is 13---> watching scary movie 
	     *    and if it is not ---> i will watch comedy,action
	     * if no friday ---> i am studying
	     */
		
		boolean isFriday=false;
		int date=13;
		
		if (isFriday) {
		
		if (date==13) {
		
			System.out.println("I will watch scary movie");	
			
		}else {
			System.out.println(" i will watch pk movie amir khan");
		}
			
				
		}else {
		System.out.println("Today is not friday, I am tudying");
		
		}
		
		System.out.println("--------Example3-----------");
		
		/* check if assignment is completed
		 * if assignment is completed 
		 *     if score >90 --> great job
		 *     if score >80 --> good job
		 *     if score >70 -->please study more
		 */
	
		int score=91;
		boolean assignment=true;
		
		if (assignment) {
		
	     if (score>90) {
	    	 
	    	 System.out.println("you did great");
	     }else if (score>80) {
	    	 
	    	 System.out.println(" good joob");
	     }else if (score>70) {
	    	 
	    	 System.out.println(" you need to study more");
	     }else {
	    	 System.out.println(" thanks for trying but you must study");
	     }
			
		} else {
			
			System.out.println("you shouid complete all assigments");
		}
		
		}
	}
	
 

