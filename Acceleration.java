import java.util.Scanner;

/**
* @author Mehmet ACIKGOZ
*/

public class Acceleration {

	/**
	 * Lab 02 Program 2
	 *  This program finds the acceleration when starting and ending velocities
	 *  as well as time span are given.
	 */
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		 *  Getting  the inputs
		 */
		
		System.out.print("Enter starting velocity in meters / second : ");
		double firstVelocity = input.nextDouble();

		System.out.print("Enter ending velocity in meters / second : ");
		double secondVelocity = input.nextDouble();
		
		System.out.print("Enter the time in seconds : ");
		double timeSpan = input.nextDouble();
		
		/*
		 *  testing the validity of the inputs  and displaying error/result 
		 */
		if (firstVelocity < 0 || secondVelocity < 0 || timeSpan < 0) {
			System.out.println("Invalid data. Please check data entered.");
		}
		else {
			double acceleration = ( secondVelocity - firstVelocity ) / timeSpan;			
			// The following line will print the result with full precision
			// System.out.println("The average acceleration is " + acceleration + " meters / second ");
			
			// The following line will print the result with 3 digits after the decimal
			System.out.printf("Acceleration : %.3f  meters / second ",  acceleration);
		}			
	}	
}
