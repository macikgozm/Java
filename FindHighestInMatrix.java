/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */
public class FindHighestInMatrix {
	
	/**
	 * This program creates a matrix with random numbers between 0 and MAX_VALUE 
	 * and finds the heighest number in it and reports it in addition to matrix itself.
	 * @param args
	 */

	public static void main(String[] args) {
		final int ROW = 10;
		final int COL = 10;
		final int MAX_VALUE = 99; 
		int [][] matrix = new int [ROW][COL];
		
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// for the inclusive random function: Min + (int)(Math.random() * ((Max - Min) + 1))
				matrix[i][j] = 0 + (int) (Math.random() * (MAX_VALUE+1) );
			}
		}
		
	
		int theHeighest = matrix[0][0];
		int indexRowtheHeighest = 0;
		int indexColtheHeighest = 0;	
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ( matrix[i][j] > theHeighest) {
					 theHeighest = matrix[i][j];
					 indexRowtheHeighest = i;
					 indexColtheHeighest = j;
				}
			}
		}
		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.printf("The highest value located at [%d][%d] is %d" , indexRowtheHeighest, indexColtheHeighest, theHeighest);
		
	}


}
