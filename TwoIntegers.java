
//package test;

import java.util.Scanner;

/* 
@author: Mehmet ACIKGOZ
This program calculates and displays the sum, product, difference, 
quotient (division), and remainder of two integers given.
*/

public class TwoIntegers {

	public static void main(String [] args) {
		
		// Getting numbers from the user
		
		System.out.print("Please enter the first positive number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();

		System.out.print("Please enter the second positive number : ");
		int num2 = input.nextInt();
		
		// Calculating the results and printing 

		System.out.println("Sum : "        + (num1 + num2) );
		System.out.println("Product : "    + (num1 * num2) );		
		System.out.println("Difference : " + (num1 - num2) );		
		System.out.println("Quotient : "   + (num1 / num2) );
		System.out.println("Remainder : "  + (num1 % num2) );
		
	}

	
}
