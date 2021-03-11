package com.syntax.class02;

public class StringExample {

	public static void main(String[] args) {
		
		String name; 
        name="Ilyas";
        
        String greeting="Good Morning !";
        String phoneNumer="123-456-7889";
        
        String stingNumber="12";
        
        
        String space=" ";
        String letter = "A";
        String letter1 ="A ";
        
        
        // Hello, my name is ilyas
        
        System.out.println("Hello, my name is "+name);
        
        //How are you Ilyas
        System.out.println("How are you "+name);
		
        int age =25;
        // I am 25
        
        System.out.println("I am "+age);
        
        char grade='A';
        //Ilyas is A student
        System.out.println(name +" is "+grade+" student");
        
        /*
         * string concatenation operator + can be used when 
         * we attach string to another string
         * we attach string to a number
         * we attach string to any character or boolean
         */
        
        String car="Tesla";
        int year =2021;
        
        // I drive 2021 Tesla
        
        System.out.println("I drive "+year+" "+car);

        String computer="Macbook";
        int memory=250;
        
        //Ilyas has Macbook with 250 GB memory
        System.out.println(name+" has "+computer+" with "+memory+" GB memory ");
        
        byte day=7;
        String month="February ";
        
        String date=month+day;
        System.out.println(date);
        
	}

}
