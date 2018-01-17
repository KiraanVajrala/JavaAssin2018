package com.Jan.Java2018.day3;

import java.util.Scanner;

public class FibanoicalNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number :");
		int series= scan.nextInt();
		
		int add1=0,add2=1,add3,i;
		
		System.out.println("fibo number:"+add1 );
		System.out.println("fibo number:"+add2 );
		
		
		for(i =2 ; i <= series ; i++) {
			add3 = add1 + add2;
			
		System.out.println("fibo number:" +add3);
		
		add1 = add2 ;		
		add2 = add3 ;
		
		
		}
		
		
	}

}
