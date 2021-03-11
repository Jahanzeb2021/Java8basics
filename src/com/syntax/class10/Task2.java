package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		String []name= new String [5];
		
		name[0]="Jahanzeb";
		name[1]="Arman";
		name[2]="Aman";
		name[3]="Fardeen";
		name[4]="Haroon";
		
		System.out.println(name[0]+" "+name[1]);
		
		System.out.println("---------------2nd Way Arryas");
		
		String []neme={"Jahanzeb","Arman","Aman","Fardeen","Haroon"};
		
		System.out.println(name[4]);
		
		System.out.println("----------------------");
		
		String []words= {"Java","Saturday","day","coding","is"};
		
		System.out.println(words[1]+" "+words[0]+" "+words[3]+" "+words[4]+" "+words[2]);
		
		System.out.println("-----------------------");
		
		for(int i=0; i<name.length;i++) {
			
			System.out.println(name[i]);
		}

	}

}
