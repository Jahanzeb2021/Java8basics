package com.syntax.class11;

public class TwoDarray {

	public static void main(String[] args) {
		
        int [][] num=new int[3][4];
        
        //1 array or a row
        num [0][0]=1;
        num [0][1]=2;
        num [0][2]=3;
        num [0][3]=3;
        
        //2 array or 2 row
        num [1][0]=10;
        num [1][1]=20;
        num [1][2]=30;
        num [1][3]=40;
        
        //2 array or 2 row
        num [2][0]=100;
        num [2][1]=200;
        num [2][2]=300;
        num [2][3]=400;
        
        
        System.out.println(num[1][3]);//40
        System.out.println(num[2][3]);//400
        
        System.out.println("-------Another way for creating a 2D of array");
        
        int [][] numbers= {
        		{1,2,3,4},
        		{10,20,30,40},
        		{100,200,300,400}
        		
        };
        
        System.out.println(numbers[1][1]);
        
        //out put
        int sum=numbers[0][2]+numbers[1][1];
        System.out.println(sum);
        
        numbers[2][2]=500;
        System.out.println(numbers[2][2]);
	}
}


