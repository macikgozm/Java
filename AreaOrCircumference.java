import java.util.Scanner;

/**
* @author Mehmet ACIKGOZ
*/

public class AreaOrCircumference {
/*
 * Lab 03 Program 1
 * This programs displays the area or circumference 
 * according to the user input after a radius is entered.
 * 
 */
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		// Getting the input for radius
		System.out.print("Please enter the radius: ");		
		double radius = input.nextDouble();
		
		// Getting the user preference for area or circumference
		System.out.print("Enter A (Area) or C (Circumference): ");
		String choice = input.next();

		// doing the math and displaying either the result or error message
		if (choice.equalsIgnoreCase("A")){
			double area = Math.PI *Math.pow(radius,2);
			//System.out.print("Area: " + area + " square feet");
			System.out.printf("Area: %.4f square feet", area);
		}
		else if (choice.equalsIgnoreCase("C")){
			double circumference= 2.0 * Math.PI *radius;
			//System.out.print("Circumference: " + circumference + " feet");
			System.out.printf("Circumference: %.4f feet", circumference);
		}
		else
		{
			System.out.println("I am sorry, I did not understand your choice");
		}
	}
	
}
