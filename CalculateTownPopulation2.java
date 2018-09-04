import java.io.IOException;
import java.util.Scanner; 

/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */

public class CalculateTownPopulation2 {

	/**
	 * This programs reads the input file and calculates the population of the towns in the file
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "D:\\JCCC\\Courses\\_Spring_2018\\CS205\\Unit08\\KansasTownsPop2.txt";
		
		Scanner input = null;
		java.io.File file = null;
		
		try {
			
			file = new java.io.File(filename);
/*
			if ( !file.exists() ) {
				//System.out.println( file.getName() + " does not exist");
				//throw IOException 
				
			}	
	*/		
			input = new Scanner(file);
		}
		catch (IOException ex){
	        System.out.println (ex.toString());
	        System.out.println("Could not find file " + file.getName());
	        System.exit(1);
		}
		
		
		
	
		
		String cityNames = "";
		int totalPopulation = 0;
		
		while(input.hasNext()) {
			
			String cityName = input.next();
			int Population = input.nextInt();
			cityNames = cityNames + " " + cityName;
			totalPopulation += Population;
		}
		
		System.out.printf("The total population of %s is %d.", cityNames, totalPopulation); 		
		input.close();		
	}	
}

