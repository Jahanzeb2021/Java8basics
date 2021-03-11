package syntax.com.reviwC01;

import java.util.Scanner;

public class SwitchStatments {

	public static void main(String[] args) {
		
		char op;
		int num1;
		int num2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first number");
		System.out.println("Enter your scond number");
		System.out.println("Enter the operation");
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		op=scanner.next().charAt(0);
		
		if(op=='+') {
			System.out.println(num1+num2);
		}else if (op=='-') {
			System.out.println(num1-num2);
		}else {
			System.out.println("unknown");
		}
		
      System.out.println("-----------------------------");
      
      switch(op) {
      case '+':
      System.out.println(num1+num2);
      
      break;
      
      case '_':
    	  System.out.println(num1-num2);
    	  break;
    	  
    	  default:
    		  System.out.println("unknown");
      }
	}

}
