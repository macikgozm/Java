import java.util.Scanner;

/**
 * 
 * @author Mehmet ACIKGOZ
 * This program will call a method that displays a simple multiplication table 
 *
 */

public class MultiplicationTable {
	
	/**
	 * This part of the program is main part of the class that
	 * will call a method that displays a simple multiplication table 
	 * @param none
	 */	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int row = input.nextInt();
		
		System.out.print("Number of columns: ");		
		int col = input.nextInt();	
		
		System.out.println();
		displayTable(row, col);
	}
	
	/**
	 * This method displays the multiplication table on the screen
	 * @param row, number of rows in the table to be displayed
	 * @param col, number of columns in the table to be displayed
	 * @return void
	 */
	public static void displayTable(int row, int col) {	
		for (int i = 1; i <= row; i++ ) {
			for (int j = 1; j <= col; j++) {
				//System.out.print( (i*j) + "\t" );
				System.out.printf("%-4d",  (i*j) );
			}
			System.out.println();
		}
	}

}
