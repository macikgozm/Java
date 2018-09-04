
/**
 * 
 * @author Mehmet ACIKGOZ
 *  This program  compute a temperature including the wind chill factor by using a 
 *  a method called computeWindChill
 *
 */


public class CalculateWindChill {
	
	/**
	 * This program  compute a temperature including the wind chill factor
	 * @param args
	 */	
	public static void main(String [] args) {
		
		// for the inclusive random function: Min + (int)(Math.random() * ((Max - Min) + 1))
		int temperature = 0 + (int )(Math.random() * 50 + 1);	
		int windSpeed = 4 + (int)(Math.random() * ((30 - 4) + 1));  	

		double twc = computeWindChill(temperature, windSpeed);

		System.out.println("Temperature: " + temperature + " degrees Fahrenheit");
		System.out.println("Wind speed: " + windSpeed + " MPH");
		System.out.printf("Temperature (including wind chill): %.1f  degrees Fahrenheit",  twc );

		
	}
	
	/**
	 * 
	 * This method will compute the windchill temperature (float or double) given a
	 * temperature and wind speed	 
	 * @pre temperature <= 50 and wind speed > 3
	 * @param temperature, in degrees Fahrenheit
	 * @param windSpeed, in MPH
	 * @return temperature including windchill in degrees Fahrenheit
	 */		
	public static double computeWindChill(int temperature, int windSpeed) {

		double wc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed,0.16) +
				0.4275 * temperature * Math.pow(windSpeed,0.16);		
		return wc;		
	}
	
	
}
