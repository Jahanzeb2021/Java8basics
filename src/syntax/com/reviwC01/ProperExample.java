package syntax.com.reviwC01;

public class ProperExample {

	public static void main(String[] args) {

		String userName = "Salma";
		String password = "Salma123";
		boolean isAllowed = true;
		double accountBalance = 1000;
		double amountToTransfer = 3000;

		if (userName.equals("Salma")) {

			if (password.equals("Salma123")) {
				System.out.println("Welcome to bank of america");
				
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount Transfered");
				}else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Incorrect password");
			}

		} else {
			System.out.println("your username is not correct please try again later");
		}
	}

}
