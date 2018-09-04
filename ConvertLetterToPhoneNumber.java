import java.util.Scanner;
/**
 * 
 * @author Mehmet ACIKGOZ
 *
 * This program converts any letter to their corresponding phone digits.
 */
public class ConvertLetterToPhoneNumber {

	/**
	 * This program converts any letter to their corresponding phone digits.
	 * @param args
	 */
	
	public static void main(String[] args) 	{
		Scanner input = new Scanner(System.in);
		
		// Get the phone number
		System.out.print("Phone number to convert: ");
		String phoneNumber = input.nextLine();
		
		// Process each character in the phone number for display
		for (int i = 0; i < phoneNumber.length(); ++i){
			// Get the character
			char ch = phoneNumber.charAt(i);
			if (Character.isLetter(ch)) {
				ch = Character.toUpperCase(ch);
				System.out.print(getNumber(ch));				
			} 
			else {
				System.out.print(ch);
			}
	
		}
		System.out.println();
		input.close();
		
	} // end method

	
	/**
	* method getNumber returns the phone digit that corresponds to
	* an upper case letter
	* @param uppercaseLetter An upper case letter to convert
	* @precondition uppercaseLetter is a valid upper case character
	* @return the corresponding digit as an integer
	*/	
	public static int getNumber(char ch) {
		if (ch >= 'A' && ch <= 'C')
			return 2;
		else if (ch >= 'D' && ch <='F')
			return 3;
		else if (ch >= 'G' && ch <='I')
			return 4;
		else if (ch >= 'J' && ch <='L')
			return 5;
		else if (ch >= 'M' && ch <='O')
			return 6;
		else if (ch >= 'P' && ch <='S')
			return 7;
		else if (ch >= 'T' && ch <='V')
			return 8;
		else 
			return 9;		
	}
}
