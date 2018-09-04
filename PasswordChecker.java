import java.util.Scanner;

/**
 * 
 * @author Mehmet ACIKGOZ
 *
 */


public class PasswordChecker {
	/**
	 * This program checks password validity.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Get the password
		System.out.print("Password: ");		
		String password = input.nextLine();

		// Check for validity
		if (isValidPassword(password))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
		input.close();
		

	}

	/**
	* method isValidPassword checks if a password meets the
	* following criteria:
	* 1) >= 8 characters
	* 2) At least 2 digits
	* 3) Consists only of letters and digits
	* @param password The password to check
	* @return true or false depending if the password is valid
	*/	
	public static boolean  isValidPassword(String passwd) {		
		
		if (passwd.length() < 8) {
			return false;
		}
			
		
		int numOfDigit = 0;		
		for (int i = 0; i < passwd.length(); i++) {
			char character = passwd.charAt(i);
			if (Character.isDigit(character) )
				numOfDigit++;
		}
		
		
		if (numOfDigit < 2) {
			return false;
		}
			
		for (int i = 0; i < passwd.length(); i++) {
			char character = passwd.charAt(i);
			//if ( !Character.isDigit(character) && !Character.isLetter(character) )
			if ( !( Character.isDigit(character) || Character.isLetter(character) ) )
				return false;				
		}		
		
		return true;
	}
}
