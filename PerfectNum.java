package com.Jan.Java2018.day3;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number :");
		int pnum= scan.nextInt();
		
		int padd=0, i ;
		
		for (i=1 ; i < pnum;i++) {
			if ( pnum % i == 0) {
				padd = padd + i;
			}
		}
		if (padd == pnum) {
			
			System.out.println("its a perfect number");
						
		} else {
			System.out.println("its not a perfect number");
		}
	}

}
