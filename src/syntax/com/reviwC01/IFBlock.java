package syntax.com.reviwC01;

public class IFBlock {

	public static void main(String[] args) {
		int number1 = 3;
		
		/*
		 * if (number1 % 5 == 0) { System.out.println("Number is divisible by 5"); if
		 * (number1 % 2 == 0) { System.out.println("Number is divisible by 2"); if
		 * (number1 % 10 == 0) { System.out.println("Number is divisible by 10"); } } }
		 * 
		 */
		//if a number is divisible by 2 5 and 10 3 lines shouid be printed if it is divisible
		//only by 5 10 two lines shouid be printed and if it is divisible only by 10 one line shouid be printed.
		if (number1 % 5 ==0) {
			System.out.println("Number is divisible by 5");
		}else {
			if(number1 % 2==0) {
				System.out.println("Number is divisible by 2");
			}else {
				System.out.println("Invalid Number !");
			}
		}
	  }
	}


