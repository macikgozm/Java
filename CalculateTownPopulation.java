import java.io.IOException;
import java.util.Scanner; 

/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */

public class CalculateTownPopulation {

	/**
	 * This programs reads the input file and calculates the population of the towns in the file
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filename = "D:\\JCCC\\Courses\\_Spring_2018\\CS205\\Unit08\\KansasTownsPop2.txt";
		
		java.io.File file = new java.io.File(filename);


		if ( !file.exists() ) {
			System.out.println( file.getName() + " does not exist");
			System.exit(1);
		}
		
		Scanner input = new Scanner(file);
		
		String cityNames = "";
		int totalPopulation = 0;
		
		while(input.hasNext()) {
			
			String cityName = input.next();
			int Population = input.nextInt();
			cityNames = cityNames + cityName+ " " ;
			totalPopulation += Population;
		}
		
		System.out.printf("The total population of %s is %d.", cityNames, totalPopulation); 		
		input.close();		
	}	
}

