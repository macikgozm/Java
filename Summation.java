import java.util.Scanner;
/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */

public class Summation {

	/*
	 * This program sums ...
	 */	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int lowerLimit = 0, upperLimit = 0, sum = 0;
		
		do {
			
			System.out.print("Lower limit: ");
			lowerLimit = input.nextInt();
			
			System.out.print("Upper Limit: ");
			upperLimit = input.nextInt();
			
			System.out.println();
			
		} while (lowerLimit > upperLimit);
		
		
		for (int i = lowerLimit; i <= upperLimit; i++) {			
			sum += i;	
		}
		
		System.out.println("The sum from " + lowerLimit + " to " + upperLimit + " is " + sum);
	}
	
	
}
