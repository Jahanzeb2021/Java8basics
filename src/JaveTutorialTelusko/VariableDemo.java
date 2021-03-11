package JaveTutorialTelusko;

public class VariableDemo {

	public static void main(String[] args) {
		
    // int,float,double
		
	byte b = 5; // 1 byte --> 8 bits --> -128 to 127
	short s = 5; // 2 byte --> 16 bits --> - 32768 to 32767
	int i = 5; // 4 byte --> 32 bits --> 
	long l= 5000000000l; // 8 byte 64 bits --> 
	
	float f = 5.5f; 
	double d = 5.5; 
	
	char c = 'A';
	c = 66; // American standard code for information interchange 
	
	System.out.println(c);
	
	
	double d1 = 5; //implicit type conversion
    System.out.println(d1);
    
    int k = (int)5.6;// explicit type conversion/casting
    System.out.println(k);
	}

}
