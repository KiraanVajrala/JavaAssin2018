package com.Jan.Java2018.day3;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int rem=0, rev = 0 ;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("enter the value");
      int num = scan.nextInt();
      
      while ( num != 0) {
    	  rem = num %10;
    	  num = num /10;
    	  rev = rev * 10 + rem;
    	  
    	  
      }
      
      System.out.println("reverse value:"+rev);
	}

}
