package syntax.com.reviwC01;

public class logicalOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number=10;
      
      /*
       * if the Variable number contains value between o to 100 print(" o to 100")
       * otherwise print out (out of range)
       */
    	
      if(number>=0) {
    	  if(number<=100) {
    		  System.out.println("0 to 100");
    	  }
      }else {
    	  System.out.println("Out of range");
      }
    	
      if(number>=0 && number<=100) {
    	  System.out.println("0 to 100");
      }else {
    	  System.out.println("Out of range");
      }
      
      if(number>=0 && number<=100) {
    	  System.out.println("checking");
    	  System.out.println("checking");
      }
	}

}
