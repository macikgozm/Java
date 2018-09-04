import java.util.Scanner;

/**
* @author Mehmet ACIKGOZ
*/

public class Project1 {

	/*
	 * CS205 - Project 1 
	 * 
	 * This program calculates the number of miles per gallon and the number of kilometers per liter when 
	 *  gallons used and starting and ending odometer readings are given.
	 *  The results are displayed to the user.
	 *  
	 */
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double KM_PER_MILE = 1.60934;
		final double LITER_PER_GALLON = 3.78541;
		
		System.out.print("Please enter number of gallons used: ");
		double gallonsUsed = input.nextDouble();
		
		if (gallonsUsed > 0.0) {
			System.out.print("Please enter the beginning odometer reading: ");
			int startingOdometer = input.nextInt();
			
			System.out.print("Please enter the ending odometer reading: ");
			int endingOdometer = input.nextInt();
			
			if (endingOdometer > startingOdometer) {
				//System.out.println("");
				double milesPerGallons = (endingOdometer - startingOdometer) / gallonsUsed;
				double kmPerLiters = milesPerGallons * KM_PER_MILE / LITER_PER_GALLON;
				System.out.printf("\nThe number of miles per gallons is: %.4f",  milesPerGallons);
				System.out.printf("\nThe number of kilometers per liter is: %.4f", kmPerLiters );				
			}
			else {
				System.out.print("I'm sorry, the ending odometer reading must be greater than the starting odometer reading.");				
			}
			
		}
		else {
			System.out.print("I'm sorry, gallons used must be greater than 0.");
		}	

	}
}
