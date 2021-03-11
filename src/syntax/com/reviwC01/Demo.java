package syntax.com.reviwC01;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 20;
		/*
		 * if (number1 % 5 == 0) { System.out.println("Number is divisible by 5"); }
		 * else if (number1 % 2 == 0) {
		 * System.out.println("Number is not divisible by 5"); } else if (1 % 10 == 0) {
		 * System.out.println("Number is divisible by 10");}
		 * 
		 */
        System.out.println("-----------------------");
		
        if (number1 % 5 == 0) {
			System.out.println("Number is divisible by 5");
			if (number1 % 2 == 0) {
				System.out.println("Number is divisible by 2");
				if (number1 % 10 == 0) {
					System.out.println("Number is divisible by 10");
				}
			}
		}

	}

}
