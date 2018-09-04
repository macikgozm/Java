import java.util.Scanner;
/**
 * 
 * @author Mehmet ACIKGOZ
 *
 * This program will sum all the integers from a lower limit through an upper limit. 
 */

public class CalculateLoopSum {

	/**
	 * This program will sum all the integers from a lower limit through an upper limit. 
	 * It uses an initial loop to ensure a valid upper and lower bound are entered.
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
