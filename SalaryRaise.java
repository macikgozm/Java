import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */

public class SalaryRaise {

	/**
	 * This program calculates and gives employee a raise
	 * @param args
	 */
	
	public static void main(String[] args) {		

		double [] salary = {100000, 200000, 300000, 400000, 500000};
		
		DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
		Scanner input = new Scanner(System.in);		
	
		// Getting the raise from the user
		System.out.print("Please enter a raise percentage: ");
		double raise = input.nextDouble();
		
		// calculating the new salaries
		for (int i = 0; i < salary.length; i++) {			
			salary[i] *= ( 1 + raise/100.0 ); 
		}

		// printing the salaries
		for (double value:salary) {
			//System.out.printf("Final salary: $ %.2f",  value);
			System.out.println(decimalFormat.format(value));
		}
	}

}
