package com.Jan.Java2018.day3;

import java.util.Scanner;

public class JavaAssin1Kiran {

	private static final Scanner scan = null;
	private static int x;

	public static void main(String[] args) {
		
//
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the a value: ");
		int a = scan.nextInt();
	
		System.out.println("enter the B value : ");
		int b = scan.nextInt();
		
		System.out.println("enter C value :");
		int c = scan.nextInt();
		
		System.out.println("enter D value :");
		int d = scan.nextInt();
		
		
		
		contrlStatementMini(a, b, c, d);
				
			}

	private static void contrlStatementMini(int a, int b, int c, int d) {
		if (a < b && a< c && a<d) {
			System.out.printf("A is less ",a );
		}else if(b<a && b<c && b<d) {
			System.out.printf("B is less"+b);
		} else if (c<a && c<b && c<d) {
			System.out.printf("C is less:"+c);
		}else if (d<a && d<b && d<c) {
			System.out.printf("D is less"+d);
		}else 
			System.out.println(" error");
	

			
		Scanner scan = new Scanner(System.in);
		
			cntrlStatementOdd(scan);
			
		
	}

	private static void cntrlStatementOdd(Scanner scan) {
		System.out.println("enter the limit:");
		int limit = scan.nextInt();
		
		for(int i = 1;i <=limit;i++) {
			if ( i % 2 != 0) {
				System.out.println(+i);
			}
		}
		
		}
}