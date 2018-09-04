import java.util.Scanner;

/* 
@author: Mehmet ACIKGOZ
This program calculates Body Mass Index when height and weight are given. 
*/

public class BodyMassIndex {
	public static void main(String [] args) {
		// constants
		final double POUND_TO_KG = 0.45359237;
		final double INCH_TO_M = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		// asking for inputs
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		weight *= POUND_TO_KG ;

		
		System.out.print("Enter height in inches: " );
		double height = input.nextDouble();
		height *= INCH_TO_M ;
	
		// doing the math
		double bmi = weight / Math.pow(height, 2);
		
		// printing the result
		System.out.print("BMI is: " + bmi );	
	}

}
