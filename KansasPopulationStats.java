import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */
public class KansasPopulationStats {
	/**
	 * This program reads cities and their population from an input file,
	 * finds the Largest city and displays some statistics.
	 * @param args
	 */

	public static void main(String[] args) throws IOException {
	
		String filename = "D:\\JCCC\\Courses\\_Spring_2018\\CS205\\Unit08\\KansasStatistics\\KansasSortedCities.csv";
		
		java.io.File file = new java.io.File(filename);
		
		if ( !file.exists() ) {
			System.out.println(file.getName() + " does not exist");
			System.exit(1);
		}
		
		Scanner input = new Scanner(file);
		DecimalFormat decimalFormat = new DecimalFormat("#,###");

		
		int totalPopulation = 0;		
		String largestCity ="";
		int biggestPopulation = 0;
		
		while (input.hasNextLine()) {
			
			String cityInfo = input.nextLine();
			String [] cityInfoArray = cityInfo.split(",");
			int Population = Integer.parseInt(cityInfoArray[1]);
			
			totalPopulation += Population;
			
			if (Population > biggestPopulation) {
				biggestPopulation = Population;
				largestCity = cityInfoArray[0];
			}				
			
		}
		
		System.out.println("Total Population: " + decimalFormat.format(totalPopulation));
		System.out.println("Largest City: " + largestCity + " (" + decimalFormat.format(biggestPopulation) + ")" );
		input.close();
	}

}
