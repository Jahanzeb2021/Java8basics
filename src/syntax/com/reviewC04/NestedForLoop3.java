package syntax.com.reviewC04;

public class NestedForLoop3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i = i +2) {
			
			System.out.println("i");
			for (int j = 0; i < 5 ; j=j-i) {
				
				System.out.println(i+ " "+j);
				
				i++;
			}
			
			System.out.println(i);
		}

	}

}
