package com.Jan.Java2018.day3;

import java.util.Scanner;

public class prime {
   public static boolean Prime(int pn) {
      // prime must be greater than 1
      if (pn <= 1) {
         return false;
      }
      int numberOfDivisor = 0;
      for (int i = 1; i <= pn; i++) {
         if (pn % i == 0) {
            numberOfDivisor++;
         }
      }
      // Divisor is only 1 and itself.
      return numberOfDivisor == 2;
   }
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("enter the Value to Check");
	   int pn = scan.nextInt();	   
			   
       {
         if (Prime(pn)) 
            System.out.print(pn + "prime number ");
         else  {
            
            	System.out.println("not a prime");
            }
         }
      }
   }
