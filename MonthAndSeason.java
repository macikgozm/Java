import java.util.Scanner;

/**
* @author Mehmet ACIKGOZ
*/

public class MonthAndSeason {

/*
 * Lab 03 Program 2
 * This program  outputs the season when the user enters a numeric month.
 * 
 */	
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		// Gettingbthe user input
		System.out.print("Enter a numeric month and I will display the season.\nMonth: ");
		int month = input.nextInt();
		
		// checking the input and displaying the result. 
		switch(month) {
			case 12:
			case  1:
			case  2:
				System.out.print("winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.print("summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.print("fall");
				break;
			default:
				System.out.print("I’m sorry, an invalid month was entered.");
		}
		
	}
}
