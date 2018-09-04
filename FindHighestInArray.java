import java.util.Scanner;
import java.util.Random;

/**
 * 
 * @author Mehmet ACIKGOZ
 * This program  finds and returns the highest value in an array
 *
 */
public class FindHighestInArray {
	/**
	 * This program  finds and returns the highest value in an array
	 * @param args
	 */

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		final int MAX_SIZE = 10;
		int [] arr = new int[MAX_SIZE];


		for (int i = 0; i < MAX_SIZE; i++) {
			// Two different ways for random...
			
			// for the inclusive random function: Min + (int)(Math.random() * ((Max - Min) + 1))
			// arr[i] = -100 + (int )(Math.random() * ( (100- (-100) ) + 1) );

			// for Random 
 			 arr[i] = rand.nextInt( 200 + 1) - 100;
			
		}

		System.out.println("Max : " + findHighest(arr) );

	}

	/**
	 * This methods find the highest in an array and returns it.
	 * @param arr, array of integer  
	 * @return max value in the array
	 */
	public static int findHighest(int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return (max);
	}	
}
