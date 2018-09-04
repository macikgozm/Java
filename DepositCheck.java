import java.util.Scanner;

/**
 * 
 * @author Mehhmet ACIKGOZ
 *
 */

public class DepositCheck {

/**
 * This program will process bank account and prevent a negative balance
 * Unit 5 - Lab
 */
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a balance : $");
		double balance = input.nextDouble();
		
		System.out.print("\nPlease enter check amount (-1 to end): $");
		double check = input.nextDouble();

		while(check > 0) {			
			if (check > balance) {
				System.out.println("Warning: Check will bounce. No transaction occurred.");
			}
			else {				
				balance -= check;
				System.out.printf("Remaining balance: $%.2f" , balance);
				System.out.println();
			}
			System.out.print("\nPlease enter check amount (-1 to end): $");
			check = input.nextDouble();
		}		
		System.out.printf("Final balance: $ %.2f",  balance);				
	}	
}
