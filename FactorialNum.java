package com.Jan.Java2018.day3;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number :");
		int Fnum= scan.nextInt(); 

		int factorial  = 1 ,i ;
		for (i=1 ; i <= Fnum ; i++) {
			factorial = factorial *  i ;
		}
		System.out.println("Factorial vallue :" +factorial );
	}

}
