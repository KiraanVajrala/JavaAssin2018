package com.Jan.Java2018.day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int prev = 0, onum , prem;
		
		Scanner scan = new Scanner(System.in);
	      
	      System.out.println("enter the value");
	      int num = scan.nextInt();
	      
	     onum = num;
	     
	     while (num>0) {
	    	 prem = num % 10;
	    	 num /= 10;
	    	 prev = prev * 10 + prem;
	     }
	     if (prev == onum) {
	    	 System.out.println("its a palindrome");
	    	   	 
	     } else {
	    	 System.out.println("its not ");
	     }
	     

	}

}
